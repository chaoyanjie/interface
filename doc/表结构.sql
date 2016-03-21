SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Indexes */

DROP INDEX goods_detail ON t_goods;



/* Drop Tables */

DROP TABLE IF EXISTS shop;
DROP TABLE IF EXISTS t_card;
DROP TABLE IF EXISTS t_dic;
DROP TABLE IF EXISTS t_goods;
DROP TABLE IF EXISTS t_interface;
DROP TABLE IF EXISTS t_message;
DROP TABLE IF EXISTS t_models;
DROP TABLE IF EXISTS t_opeation;
DROP TABLE IF EXISTS t_parameter;
DROP TABLE IF EXISTS t_project;
DROP TABLE IF EXISTS t_task;
DROP TABLE IF EXISTS t_user;




/* Create Tables */

-- shop
CREATE TABLE shop
(
	shopid int NOT NULL AUTO_INCREMENT COMMENT 'shopid',
	latlng  COMMENT 'latlng',
	PRIMARY KEY (shopid)
) COMMENT = 'shop' DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


-- t_card
CREATE TABLE t_card
(
	-- 全名
	fullName varchar(50) COMMENT '全名',
	-- 小名
	petName varchar(50) COMMENT '小名',
	-- 昵称
	nickName varchar(50) COMMENT '昵称',
	-- 电话
	phone varchar(50) COMMENT '电话',
	-- 图片
	imgUrl varchar(50) COMMENT '图片',
	-- 地址
	address varchar(50) COMMENT '地址',
	-- 链接
	linkUrl varchar(50) COMMENT '链接'
) COMMENT = 't_card' DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;


-- t_dic
CREATE TABLE t_dic
(
	-- 字典名称
	dic_name varchar(50) NOT NULL COMMENT '字典名称',
	-- 字典编码
	dic_code varchar(50) NOT NULL COMMENT '字典编码',
	-- 父节点ID
	dic_pid varchar(50) NOT NULL COMMENT '父节点ID',
	-- 主键
	id int NOT NULL AUTO_INCREMENT COMMENT '主键',
	PRIMARY KEY (id)
) COMMENT = 't_dic' DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;


-- t_goods
CREATE TABLE t_goods
(
	-- 商品名称
	goods_name varchar(50) COMMENT '商品名称',
	-- 商品详情
	goods_detail varchar(300) COMMENT '商品详情',
	-- 商品图片
	goods_imgs varchar(250) COMMENT '商品图片',
	-- 标签
	goods_tags varchar(150) COMMENT '标签',
	-- 代码
	goods_code varchar(50) COMMENT '代码',
	-- 销售总数
	soldnum int COMMENT '销售总数',
	-- 库存总数
	inventory int COMMENT '库存总数',
	-- 商品价格
	goods_price decimal COMMENT '商品价格',
	-- 商品售价
	goods_sprice decimal COMMENT '商品售价',
	-- 状态
	goods_status tinyint COMMENT '状态',
	-- 商品类型
	goods_type tinyint COMMENT '商品类型',
	-- 创建时间
	create_time int COMMENT '创建时间',
	-- 更新时间
	update_time int COMMENT '更新时间',
	-- 主键
	id int NOT NULL AUTO_INCREMENT COMMENT '主键',
	PRIMARY KEY (id)
) COMMENT = 't_goods' DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;


-- t_interface
CREATE TABLE t_interface
(
	-- 工程编号
	pro_id varchar(50) COMMENT '工程编号',
	-- 接口名称
	iname varchar(50) COMMENT '接口名称',
	-- 接口代码
	icode varchar(50) COMMENT '接口代码',
	-- 接口详情
	idetail varchar(50) COMMENT '接口详情',
	-- 前驱接口用于自动化测试
	h_inter_id varchar(50) COMMENT '前驱接口用于自动化测试',
	-- 主键
	id int COMMENT '主键'
) COMMENT = 't_interface' DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;


-- t_message
CREATE TABLE t_message
(
	-- 主键
	id int COMMENT '主键',
	-- 类型
	utype int COMMENT '类型',
	-- 内容
	content text COMMENT '内容',
	-- 标签
	tags varchar(100) COMMENT '标签',
	-- 创建时间
	create_time int COMMENT '创建时间',
	-- 显示时间
	show_time int COMMENT '显示时间',
	-- 地址
	address varchar(50) COMMENT '地址',
	-- 联系方式
	phone varchar(50) COMMENT '联系方式',
	title varchar(50) COMMENT 'title'
) COMMENT = 't_message' DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;


-- t_models
CREATE TABLE t_models
(
	-- 模块名称
	model_name varchar(50) COMMENT '模块名称',
	-- 模块描述
	model_detail varchar(50) COMMENT '模块描述',
	-- 模块接口列表
	inter_ids varchar(50) COMMENT '模块接口列表',
	-- 所属工程
	pro_id varchar(50) COMMENT '所属工程',
	-- 主键
	id int COMMENT '主键'
) COMMENT = 't_models' DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;


-- t_opeation
CREATE TABLE t_opeation
(
	-- 主键
	id int NOT NULL AUTO_INCREMENT COMMENT '主键',
	-- 操作名称
	op_name varchar(32) COMMENT '操作名称',
	-- 操作地址
	op_site varchar(50) COMMENT '操作地址',
	-- 状态
	status tinyint COMMENT '状态',
	-- 父节点
	op_pid int COMMENT '父节点',
	-- 排序
	op_order int COMMENT '排序',
	PRIMARY KEY (id)
) COMMENT = 't_opeation' DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;


-- t_parameter
CREATE TABLE t_parameter
(
	-- 接口编号
	inter_id varchar(50) COMMENT '接口编号',
	-- 参数名称
	pa_name varchar(50) COMMENT '参数名称',
	-- 参数代码
	pa_code varchar(50) COMMENT '参数代码',
	-- 参数值
	pa_value varchar(50) COMMENT '参数值',
	-- 主键
	id int COMMENT '主键',
	pa_type varchar(10) DEFAULT 'String' COMMENT 'pa_type'
) COMMENT = 't_parameter' DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;


-- t_project
CREATE TABLE t_project
(
	-- 工程名称
	pname varchar(50) COMMENT '工程名称',
	-- 版本号
	pversion varchar(50) COMMENT '版本号',
	-- 工程描述
	pdetail varchar(50) COMMENT '工程描述',
	-- 主键
	id int COMMENT '主键'
) COMMENT = 't_project' DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;


-- 用户工作项
CREATE TABLE t_task
(
	id int NOT NULL COMMENT 'id',
	uid int COMMENT '用户编号',
	pid int COMMENT '项目编号',
	isComplete tinyint COMMENT '是否消除影响',
	iid int COMMENT '接口编号',
	PRIMARY KEY (id)
) COMMENT = '用户工作项';


-- t_user
CREATE TABLE t_user
(
	-- 用户代码
	user_code varchar(50) COMMENT '用户代码',
	-- 昵称
	nick_name varchar(50) COMMENT '昵称',
	-- 密码
	pass_word varchar(50) COMMENT '密码',
	-- 角色类型
	role_type tinyint COMMENT '角色类型',
	-- 开放id
	open_id varchar(50) COMMENT '开放id',
	-- 用户状态
	u_status tinyint COMMENT '用户状态',
	-- 主键
	id int NOT NULL AUTO_INCREMENT COMMENT '主键',
	PRIMARY KEY (id)
) COMMENT = 't_user' DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;



/* Create Indexes */

CREATE INDEX goods_detail USING BTREE ON t_goods (goods_detail ASC);



