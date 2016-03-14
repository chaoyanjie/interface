package com.web.util;

import java.io.IOException;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
/**
 * 发送http 请求
 * @author Administrator
 *
 */
public class HttpReqUtil {
	/**
	 * map 转成请求json 串
	 * @param fid 功能号
	 * @param map 参数
	 * @return
	 */
	private static String getpa(String fid, Map<String, String> map) {
		StringBuffer buf = new StringBuffer();
		StringBuffer sb = new StringBuffer();
		for (String str : map.keySet()) {
			sb.append("\"" + str + "\":\"" + map.get(str) + "\",");
		}
		buf.append("{\"functionId\": \"" + fid + "\",\"params\": {"
				+ sb.toString().substring(0, sb.toString().length() - 1) + "}}");
		System.out.println(buf.toString());
		return buf.toString();
	}
	/**
	 * 执行请求串
	 * @param fid 功能号
	 * @param map 参数map
	 * @param surl 请求地址
	 * @return
	 * @throws IOException
	 */
	public static String post(String fid, Map map,String surl) throws IOException {
		String responseBody = "";
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			HttpPost httpPost = new HttpPost(surl);
			httpPost.setHeader("User-Agent", "Agent:MangoSaohuo/1.3.0 (iPhone; iOS 8.1; Scale/2.00)");
			StringEntity se = new StringEntity(getpa(fid, map));
			se.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE,
					"application/json"));
			httpPost.setEntity(se);
			ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
				public String handleResponse(final HttpResponse response)
						throws ClientProtocolException, IOException {
					int status = response.getStatusLine().getStatusCode();
					if (status >= 200 && status < 300) {
						HttpEntity entity = response.getEntity();

						return entity != null ? EntityUtils.toString(entity,
								"utf-8") : null;
					} else {
						throw new ClientProtocolException(
								"Unexpected response status: " + status);
					}
				}

			};

			responseBody = httpclient.execute(httpPost, responseHandler);
		} finally {
			httpclient.close();
		}

		return responseBody;
	}
}
