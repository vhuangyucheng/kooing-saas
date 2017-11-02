/*
Navicat MySQL Data Transfer

Source Server         : kooing
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : db_kooing2_saas

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2017-11-02 23:12:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_goods
-- ----------------------------
DROP TABLE IF EXISTS `tb_goods`;
CREATE TABLE `tb_goods` (
  `goods_id` bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `uuid` char(255) DEFAULT NULL COMMENT '表唯一标识',
  `goods_commonid` int(11) DEFAULT NULL COMMENT '商品公共表id',
  `goods_name` char(100) DEFAULT NULL COMMENT '商品名称（+规格名称）',
  `goods_jingle` char(100) DEFAULT NULL COMMENT '商品广告词',
  `store_id` int(11) DEFAULT NULL COMMENT '商店id',
  `store_name` char(100) DEFAULT NULL COMMENT '商店名称',
  `gc_id` int(11) DEFAULT NULL COMMENT '商品分类',
  `gc_id_1` int(11) DEFAULT NULL COMMENT '一级分类',
  `gc_id_2` int(11) DEFAULT NULL COMMENT '二级分类',
  `gc_id_3` int(11) DEFAULT NULL COMMENT '三级分类',
  `goods_price` decimal(10,0) DEFAULT NULL COMMENT '商品价格',
  `goods_promotion_price` decimal(10,0) DEFAULT NULL COMMENT '商品促销价格',
  `goods_storage_alarm` int(11) DEFAULT NULL COMMENT '库存警告值',
  `goods_storage` int(11) DEFAULT NULL COMMENT '商品库存',
  `goods_image` varchar(1000) DEFAULT NULL COMMENT '商品主图',
  `goods_state` int(11) DEFAULT NULL COMMENT '商品状态 0下架，1正常，2删除，10违规（禁售）',
  `goods_verify` int(11) DEFAULT NULL COMMENT '商品审核中 1通过，0未通过，10审核中',
  `evaluation_count` int(11) DEFAULT NULL COMMENT '评价数',
  `evaluation_good_star` int(11) DEFAULT NULL COMMENT '好评星级',
  `is_virtual` int(11) DEFAULT NULL COMMENT '是否为虚拟商品 1是，0否',
  `goods_collect` int(11) DEFAULT NULL COMMENT '收藏数量',
  `goods_likenum` int(11) DEFAULT NULL COMMENT '点赞数量',
  `goods_share` varchar(255) DEFAULT NULL COMMENT '分享数量',
  `is_promotion` int(11) DEFAULT NULL COMMENT '是否为打折商品 0打折，1不打折',
  PRIMARY KEY (`goods_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_odm_order
-- ----------------------------
DROP TABLE IF EXISTS `tb_odm_order`;
CREATE TABLE `tb_odm_order` (
  `order_id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `uuid` int(11) DEFAULT NULL COMMENT '表唯一标识',
  `order_sn` char(100) DEFAULT NULL COMMENT '订单编号',
  `pay_sn` char(100) DEFAULT NULL,
  `store_id` int(11) DEFAULT NULL COMMENT '商店id',
  `store_name` char(100) DEFAULT NULL COMMENT '商店名字',
  `store_logo` varchar(512) DEFAULT NULL,
  `buyer_id` int(11) DEFAULT NULL COMMENT '买家id',
  `buyer_name` char(100) DEFAULT NULL COMMENT '买家名字',
  `add_time` datetime DEFAULT NULL COMMENT '订单生成时间',
  `payment_code` char(100) DEFAULT NULL COMMENT '支付方式代码',
  `payment_time` datetime DEFAULT NULL COMMENT '支付（付款）时间',
  `sales_amount` decimal(12,2) DEFAULT NULL COMMENT '商品销售价总和（打折后）',
  `freight` decimal(12,2) DEFAULT NULL COMMENT '运费',
  `evaluation` int(11) DEFAULT NULL COMMENT '评价状态 0未评价， 1已评价，2已过期未评价',
  `order_state` int(11) DEFAULT NULL COMMENT '订单状态：0(已取消)10(默认):未付款;20:待发货;21:待收货;30:交易完成;31:交易关闭；',
  `refund_state` int(11) DEFAULT NULL COMMENT '退款状态：0无退款，1部分退款，2全部退款',
  `refund_amount` decimal(10,0) DEFAULT NULL COMMENT '退款金额',
  `order_amount` decimal(12,2) DEFAULT NULL COMMENT '商品总价格-原价总和',
  `finished_time` datetime DEFAULT NULL COMMENT '订单完成时间',
  `order_message` varchar(2000) DEFAULT NULL COMMENT '订单留言',
  `evalseller_time` datetime DEFAULT NULL COMMENT '评价时间',
  `evalseller_message` varchar(2000) DEFAULT NULL COMMENT '订单评价',
  `shipping_time` datetime DEFAULT NULL COMMENT '确定收货时间',
  `buyer_address` varchar(250) DEFAULT NULL COMMENT '详细地址',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_odm_order_goods
-- ----------------------------
DROP TABLE IF EXISTS `tb_odm_order_goods`;
CREATE TABLE `tb_odm_order_goods` (
  `rec_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '订单商品表索引id',
  `uuid` char(100) DEFAULT NULL COMMENT '表唯一标识',
  `order_id` int(11) DEFAULT NULL COMMENT '订单id',
  `goods_id` int(11) DEFAULT NULL COMMENT '商品id',
  `goods_name` char(100) DEFAULT NULL COMMENT '商品名称',
  `goods_price` decimal(12,2) DEFAULT NULL COMMENT '商品价格',
  `goods_promotion_price` decimal(12,2) DEFAULT NULL COMMENT '商品促销价格',
  `goods_num` int(11) DEFAULT NULL COMMENT '商品数量',
  `store_id` int(11) DEFAULT NULL COMMENT '商品id',
  `buyer_id` int(11) DEFAULT NULL COMMENT '买家id',
  `is_promotion` int(11) DEFAULT NULL COMMENT '是否打折 0打折，1不打折',
  PRIMARY KEY (`rec_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_shop
-- ----------------------------
DROP TABLE IF EXISTS `tb_shop`;
CREATE TABLE `tb_shop` (
  `store_id` bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `uuid` char(100) DEFAULT NULL COMMENT '表唯一标识',
  `store_name` char(100) DEFAULT NULL COMMENT '店铺名称',
  `grade_id` int(11) DEFAULT NULL COMMENT '店铺等级',
  `member_id` int(11) DEFAULT NULL COMMENT '会员id',
  `member_name` char(100) DEFAULT NULL COMMENT '会员名称',
  `sc_id` int(11) DEFAULT NULL COMMENT '店铺分类',
  `store_company_name` char(100) DEFAULT NULL COMMENT '店铺公司名',
  `store_address` varchar(200) DEFAULT NULL COMMENT '详细地址',
  `store_sort` int(11) DEFAULT NULL COMMENT '排列方式',
  `store_close_info` varchar(1000) DEFAULT NULL COMMENT '店铺关闭原因',
  `store_banner` char(250) DEFAULT NULL COMMENT '店铺横幅',
  `store_avatar` char(250) DEFAULT NULL COMMENT '店铺头像',
  `store_qq` char(250) DEFAULT NULL COMMENT '店铺qq',
  `store_wechat` char(64) DEFAULT NULL COMMENT '店铺微信',
  `store_phone` char(64) DEFAULT NULL COMMENT '店铺电话',
  `store_keywords` char(250) DEFAULT NULL COMMENT '店铺标签',
  `store_description` char(250) DEFAULT NULL COMMENT '店铺装修标签',
  `store_zip` char(100) DEFAULT NULL COMMENT '邮编',
  `store_register_time` datetime DEFAULT NULL COMMENT '注册时间',
  `store_end_time` datetime DEFAULT NULL COMMENT '店铺关闭时间',
  `store_label` char(250) DEFAULT NULL COMMENT '店铺logo',
  `store_introduction` varchar(1024) DEFAULT NULL COMMENT '店铺介绍',
  `store_zy` text COMMENT '店铺主营',
  `store_domain` char(250) DEFAULT NULL COMMENT '店铺二级域名',
  `store_domain_times` int(11) DEFAULT NULL COMMENT '二级域名修改次数',
  `store_theme` char(250) DEFAULT NULL COMMENT '店铺主题',
  `store_credit` int(11) DEFAULT NULL COMMENT '店铺信用',
  `goods_number` int(11) DEFAULT NULL,
  `store_sales` int(11) DEFAULT NULL COMMENT '店铺销量',
  PRIMARY KEY (`store_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_shops_comment
-- ----------------------------
DROP TABLE IF EXISTS `tb_shops_comment`;
CREATE TABLE `tb_shops_comment` (
  `goods_comment_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '商品评论id',
  `uuid` char(100) DEFAULT NULL COMMENT '表唯一标识',
  `store_id` int(11) DEFAULT NULL COMMENT '商店id',
  `goods_id` int(11) DEFAULT NULL COMMENT '商品id',
  `comment_virtual` int(11) DEFAULT NULL COMMENT '是否为虚假评论：1是，2不是',
  `member_id` int(11) DEFAULT NULL COMMENT '会员id',
  `member_avatar` char(200) DEFAULT NULL COMMENT '会员头像',
  `comment_photo` char(200) DEFAULT NULL COMMENT '评论图片',
  `comment_content` text COMMENT '商品评论',
  PRIMARY KEY (`goods_comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_shop_joinin
-- ----------------------------
DROP TABLE IF EXISTS `tb_shop_joinin`;
CREATE TABLE `tb_shop_joinin` (
  `shop_joinin_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `member_id` int(11) DEFAULT NULL COMMENT '会员标识',
  `uuid` char(100) DEFAULT NULL COMMENT '表唯一标识',
  `member_name` char(100) DEFAULT NULL COMMENT '店主用户名',
  `member_phone` char(100) DEFAULT NULL COMMENT '店主电话',
  `member_account` char(50) DEFAULT NULL COMMENT '管理员账号',
  `member_password` char(100) DEFAULT NULL COMMENT '用户密码',
  `store_type` int(11) DEFAULT NULL COMMENT '店铺类型 0：个人，1：企业',
  `member_address` char(200) DEFAULT NULL COMMENT '联系地址',
  `member_email` char(100) DEFAULT NULL COMMENT '联系邮箱',
  `idcard` char(50) DEFAULT NULL COMMENT '身份证号码',
  `idcard_front` char(200) DEFAULT NULL COMMENT '身份证正面照',
  `idcard_back` char(200) DEFAULT NULL COMMENT '身份证背面',
  `idcard_hand_license` char(200) DEFAULT NULL COMMENT '手执身份证照片',
  `store_name` char(50) DEFAULT NULL COMMENT '店铺名称',
  `auth_state` int(11) DEFAULT NULL COMMENT '认证状态 : 0：未认证 ；1：未通过认证 ；2认证成功；3:待审核',
  `auth_time` datetime DEFAULT NULL COMMENT '认证成功时间',
  `company_name` char(100) DEFAULT NULL COMMENT '公司名称',
  `company_province_id` int(11) DEFAULT NULL COMMENT '公司省份id',
  `company_city_id` int(11) DEFAULT NULL COMMENT '公司城市id',
  `company_address` char(200) DEFAULT NULL COMMENT '公司地址',
  `company_phone` char(100) DEFAULT NULL COMMENT '公司电话',
  PRIMARY KEY (`shop_joinin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_shop_sns_comment
-- ----------------------------
DROP TABLE IF EXISTS `tb_shop_sns_comment`;
CREATE TABLE `tb_shop_sns_comment` (
  `scomm_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '店铺评价id主键',
  `uuid` char(100) DEFAULT NULL COMMENT '表唯一标识',
  `store_id` int(11) DEFAULT NULL COMMENT '店铺id',
  `scomm_content` text COMMENT '评论内容',
  `scomm_membername` char(100) DEFAULT NULL COMMENT '评论名称',
  `scomm_memberid` int(11) DEFAULT NULL COMMENT '评论人id',
  `scomm_time` datetime DEFAULT NULL COMMENT '评论时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  `scomm_virtual` int(11) DEFAULT NULL COMMENT '是否为虚假评论:1是，2不是',
  PRIMARY KEY (`scomm_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tb_urs_member
-- ----------------------------
DROP TABLE IF EXISTS `tb_urs_member`;
CREATE TABLE `tb_urs_member` (
  `member_id` bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '会员ID',
  `uuid` char(100) DEFAULT NULL COMMENT '表唯一标识',
  `member_name` char(100) DEFAULT NULL COMMENT '会员名称',
  `member_truename` char(100) DEFAULT NULL COMMENT '会员真实名称',
  `member_avatar` char(200) DEFAULT NULL COMMENT '会员头像',
  `member_sex` int(1) DEFAULT NULL COMMENT '会员性别：\r\n0：保密\r\n1：男\r\n2：女',
  `idcard` char(50) DEFAULT NULL COMMENT '身份证',
  `member_birthday` date DEFAULT NULL COMMENT '会员生日',
  `member_password` char(100) DEFAULT NULL COMMENT '账号密码',
  `member_pay_password` char(100) DEFAULT NULL COMMENT '支付密码',
  `member_email` char(100) DEFAULT NULL COMMENT '邮箱',
  `member_email_bind` int(4) DEFAULT NULL COMMENT '0没绑定，1绑定',
  `member_mobile` char(100) DEFAULT NULL COMMENT '手机',
  `member_mobile_bind` int(4) DEFAULT NULL COMMENT '0未绑定，1绑定',
  `member_qq` char(100) DEFAULT NULL COMMENT 'QQ号',
  `member_login_num` int(10) DEFAULT NULL COMMENT '登陆次数',
  `member_register_time` datetime DEFAULT NULL COMMENT '注册时间',
  `member_login_time` datetime DEFAULT NULL COMMENT '当前登陆时间',
  `member_old_login_time` datetime DEFAULT NULL COMMENT '上次登录时间',
  `member_login_ip` char(100) DEFAULT NULL COMMENT '登陆ip',
  `member_exit_time` datetime DEFAULT NULL COMMENT '退出时间',
  `member_wechat_openid` varchar(100) DEFAULT NULL COMMENT '微信互联id',
  `member_wechat_info` text COMMENT '微信账号相关信息',
  `member_qq_openid` varchar(100) DEFAULT NULL COMMENT 'qq互联id',
  `member_qq_info` text COMMENT 'qq账号相关信息',
  `member_sina_openid` varchar(100) DEFAULT NULL COMMENT '新浪相关id',
  `member_sina_info` text COMMENT '新浪相关信息',
  `member_points` int(11) DEFAULT NULL COMMENT '会员积分',
  `member_areaid` int(11) DEFAULT NULL COMMENT '地区号',
  `member_cityid` int(11) DEFAULT NULL COMMENT '城市号',
  `member_provinceid` int(11) DEFAULT NULL COMMENT '省份号',
  `member_exppoints` int(11) DEFAULT NULL COMMENT '经验值',
  `member_grade` int(3) DEFAULT NULL COMMENT '会员等级\r\n1，普通会员\r\n2，黄金会员\r\n3，砖石会员\r\n',
  `store_id` int(11) DEFAULT NULL COMMENT '相关店铺id',
  `clientid` varchar(255) DEFAULT NULL COMMENT '设备号',
  `idcard_front` char(200) DEFAULT NULL COMMENT '身份证正面照',
  `idcard_back` char(200) DEFAULT NULL COMMENT '身份证背面照片',
  `idcard_hand_license` char(200) DEFAULT NULL COMMENT '手执身份证照片',
  `member_address` varchar(250) DEFAULT NULL COMMENT '详细地址',
  `member_virtual` int(11) DEFAULT NULL COMMENT '是否为虚假用户：0是，1不是',
  PRIMARY KEY (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
