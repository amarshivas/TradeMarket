-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.5.24 - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for trademarket
CREATE DATABASE IF NOT EXISTS `trademarket` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `trademarket`;

-- Dumping structure for table trademarket.gainers_losers
CREATE TABLE IF NOT EXISTS `gainers_losers` (
  `gainers_losers_id` int(10) NOT NULL,
  `company_name` varchar(20) NOT NULL,
  `price` float NOT NULL,
  `percentage` float NOT NULL,
  `company_url` varchar(20) NOT NULL,
  PRIMARY KEY (`gainers_losers_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table trademarket.gainers_losers: ~12 rows (approximately)
/*!40000 ALTER TABLE `gainers_losers` DISABLE KEYS */;
INSERT INTO `gainers_losers` (`gainers_losers_id`, `company_name`, `price`, `percentage`, `company_url`) VALUES
	(6650, 'UltraTechCement', 3874.35, 4.73, ''),
	(6651, 'Power Grid Corp', 182, 4.21, ''),
	(6652, 'IndusInd Bank', 1194.6, 3.56, ''),
	(6653, 'NTPC', 166.8, 3.25, ''),
	(6654, 'Adani Ports', 275.45, 2.91, ''),
	(6655, 'SUNPHARMA', 20291.9, -3.12, ''),
	(6656, 'RELIANCE', 77604.1, -12.45, ''),
	(6657, 'DRREDDY', 9842.9, -23.18, ''),
	(6658, 'LUPIN', 12848.3, -24.9, ''),
	(6659, 'BANKBARODA', 15080.7, -18.17, ''),
	(6660, 'ACC', 13481, -42.56, ''),
	(6661, 'AUROPHARMA', 113481, -28.26, '');
/*!40000 ALTER TABLE `gainers_losers` ENABLE KEYS */;

-- Dumping structure for table trademarket.latest_news
CREATE TABLE IF NOT EXISTS `latest_news` (
  `latest_news_id` int(15) NOT NULL,
  `latest_news_name` varchar(500) DEFAULT NULL,
  `latest_news_url` varchar(500) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  PRIMARY KEY (`latest_news_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table trademarket.latest_news: ~8 rows (approximately)
/*!40000 ALTER TABLE `latest_news` DISABLE KEYS */;
INSERT INTO `latest_news` (`latest_news_id`, `latest_news_name`, `latest_news_url`, `created_date`) VALUES
	(899999999, 'Hope for double-digit revenue run rate by Q4FY17: Just Dial', NULL, '2017-09-25 06:31:26'),
	(900000000, 'Why investors can stop freaking out over the Fed, in three words', NULL, '2017-09-25 06:31:26'),
	(900000001, 'Two Fed rate hikes \'conceivable\' in 2016, Sept in play: Lockhart', NULL, '2017-09-25 06:31:26'),
	(900000002, 'Dish TV, Videocon D2H in final stages of merger deal: Sources', NULL, '2017-09-25 06:31:26'),
	(900000003, 'Cisco Systems to lay off about 14,000 employees: Report', NULL, '2017-09-25 06:31:26'),
	(900000004, 'Ready to Talk on Terror Not on Kashmir: India Tells Pakistan', NULL, '2017-09-25 06:31:26'),
	(900000005, 'The knowledge you need to take your SME ahead', NULL, '2017-09-25 06:31:26'),
	(900000006, 'Click here for the best real estate investment advice', NULL, '2017-09-25 06:31:26');
/*!40000 ALTER TABLE `latest_news` ENABLE KEYS */;

-- Dumping structure for table trademarket.losers
CREATE TABLE IF NOT EXISTS `losers` (
  `loser_id` int(10) NOT NULL,
  `company_name` varchar(20) DEFAULT NULL,
  `company_url` varchar(20) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `lose_per` float DEFAULT NULL,
  PRIMARY KEY (`loser_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table trademarket.losers: ~12 rows (approximately)
/*!40000 ALTER TABLE `losers` DISABLE KEYS */;
INSERT INTO `losers` (`loser_id`, `company_name`, `company_url`, `price`, `lose_per`) VALUES
	(7750, '', 'Coal India', 339.05, 2.52),
	(7751, '', 'Larsen', 1482.1, 1.36),
	(7752, '', 'Tata Power', 76.9, 1.35),
	(7753, '', 'Tata Steel', 387.2, 1.19),
	(7754, '', 'Tech Mahindra', 469.5, 1.9),
	(7755, '', 'HDFC', 14278.9, 1.12),
	(7756, '', 'CIPLA', 3827.45, 1.31),
	(7757, '', 'VEDL', 11770.7, 23.83),
	(7758, '', 'HINDALCO', 5835.2, 24.21),
	(7759, '', 'IBULHSGFIN', 16859.5, 24.12),
	(7760, '', 'LT', 11120.1, 12.15),
	(7761, '', 'ITC', 19135.2, 16.17);
/*!40000 ALTER TABLE `losers` ENABLE KEYS */;

-- Dumping structure for table trademarket.marquee
CREATE TABLE IF NOT EXISTS `marquee` (
  `marquee_id` int(20) NOT NULL,
  `marquee_name` varchar(300) NOT NULL,
  PRIMARY KEY (`marquee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table trademarket.marquee: ~2 rows (approximately)
/*!40000 ALTER TABLE `marquee` DISABLE KEYS */;
INSERT INTO `marquee` (`marquee_id`, `marquee_name`) VALUES
	(111, 'NPAs of associate banks to weigh on SBI: Religare Capital'),
	(112, 'Julius Baer analyst sees opportunities in despised China market');
/*!40000 ALTER TABLE `marquee` ENABLE KEYS */;

-- Dumping structure for table trademarket.news
CREATE TABLE IF NOT EXISTS `news` (
  `news_id` bigint(20) NOT NULL,
  `news_name` varchar(100) NOT NULL,
  `news_displayname` varchar(200) NOT NULL,
  `news_url` varchar(100) DEFAULT NULL,
  `news_rating` int(10) DEFAULT NULL,
  `news_hitcount` int(10) DEFAULT NULL,
  `news_createddate` datetime NOT NULL,
  `news_lastmodifieddate` datetime NOT NULL,
  `lastmodifiedby` bigint(10) DEFAULT NULL,
  `news_createdby` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table trademarket.news: ~8 rows (approximately)
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` (`news_id`, `news_name`, `news_displayname`, `news_url`, `news_rating`, `news_hitcount`, `news_createddate`, `news_lastmodifieddate`, `lastmodifiedby`, `news_createdby`) VALUES
	(7770, 'mostread', 'IPO preview: ICICI Lombards valuation steep, but a decent bet', '', 4, 232, '2017-10-05 21:39:22', '2017-10-02 12:45:56', 0, 2017),
	(7771, 'mostread', 'BUY or SELL ideas from experts for Thursday, 14 September 2017', '', 3, 236, '2017-10-05 21:39:26', '2017-10-02 12:45:56', 0, 2017),
	(7772, 'mostread', 'Enfield local demand to sustain Eicher valuations', '', 4, 239, '2017-10-05 21:39:29', '2017-10-02 12:45:56', 0, 2017),
	(7773, 'mostread', 'Asia stocks step back from decade high as China posts rare data miss', '', 3, 243, '2017-10-05 21:39:33', '2017-10-02 12:45:56', 0, 2017),
	(7774, 'mostread', 'Top stocks in focus on Thursday, 14 September 2017', '', 3, 245, '2017-10-05 21:39:37', '2017-10-02 12:45:56', 0, 2017),
	(7775, 'mostread', 'What changed your market while you were asleep', '', 6, 248, '2017-10-05 21:39:40', '2017-10-02 12:45:56', 0, 2017),
	(7776, 'mostread', 'Religare institutional shareholders move court seeking ouster of board', '', 4, 222, '2017-10-05 21:39:43', '2017-10-02 12:45:56', 0, 2017),
	(7777, 'mostread', 'InterGlobe Aviations share sale to fetch up to Rs 3,945 crore', '', 3, 217, '2017-10-05 21:39:54', '2017-10-02 12:45:56', 0, 2017);
/*!40000 ALTER TABLE `news` ENABLE KEYS */;

-- Dumping structure for table trademarket.sectors
CREATE TABLE IF NOT EXISTS `sectors` (
  `sector_id` int(20) NOT NULL,
  `sector_name` varchar(300) NOT NULL,
  `sector_url` varchar(300) DEFAULT NULL,
  `price_value` float NOT NULL,
  `change_value` float NOT NULL,
  PRIMARY KEY (`sector_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table trademarket.sectors: ~15 rows (approximately)
/*!40000 ALTER TABLE `sectors` DISABLE KEYS */;
INSERT INTO `sectors` (`sector_id`, `sector_name`, `sector_url`, `price_value`, `change_value`) VALUES
	(999, 'S&P BSE Auto', '', 21526.2, 71.65),
	(1000, 'S&P BSE BANKEX', '', 22195.7, 358.34),
	(1001, 'Bank Nifty', '', 19352.8, 311.55),
	(1002, 'S&P BSE Capital Goods', '', 15068.5, 63.88),
	(1003, 'S&P BSE Consumer Durables', '', 12085.3, 58.88),
	(1004, 'S&P BSE FMCG', '', 8699.56, 10.03),
	(1005, 'S&P BSE Healthcare', '', 16202.8, 114.56),
	(1006, 'S&P BSE IT', '', 10589.5, 30.88),
	(1007, 'S&P BSE Metals', '', 10043.5, 53.3),
	(1008, 'S&P Oil & Gas', '', 10778.6, 81.19),
	(1009, 'S&P BSE PSU', '', 7457.49, 74.11),
	(1010, 'S&P BSE TECk', '', 5816.11, 1.17),
	(1011, 'S&P BSE Small Cap', '', 12403.7, 123.49),
	(1012, 'S&P BSE Mid-Cap', '', 12967.7, 56.1),
	(1013, 'Nifty Midcap 100', '', 15098.3, 114.4);
/*!40000 ALTER TABLE `sectors` ENABLE KEYS */;

-- Dumping structure for table trademarket.stockticker
CREATE TABLE IF NOT EXISTS `stockticker` (
  `stocktickerID` bigint(10) NOT NULL,
  `indexname` varchar(30) NOT NULL,
  `pricevalue` float NOT NULL,
  `chngedvalue` float NOT NULL,
  `changeper` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table trademarket.stockticker: ~12 rows (approximately)
/*!40000 ALTER TABLE `stockticker` DISABLE KEYS */;
INSERT INTO `stockticker` (`stocktickerID`, `indexname`, `pricevalue`, `chngedvalue`, `changeper`) VALUES
	(5001, 'SENSEX', 27993.6, -66.59, -0.24),
	(5002, 'NHAI', 1256, 16.2, 1.31),
	(5003, 'Euro-Rupee', 75.42, 0.03, 0.04),
	(5004, 'IIFL', 1006.51, -1.25, -0.12),
	(5005, 'NIFTY50', 8638.23, -8.35, -0.1),
	(5006, 'SILVER', 46343.6, -186, -0.4),
	(5007, 'Dollar-Rupee', 66.865, 0, 0),
	(5008, 'CRUDEOIL', 3097, -7, -0.23),
	(5009, 'GOLD', 31350.2, -117, -0.37),
	(5010, 'FTSC', 6887.93, -5.99, -0.09),
	(5011, 'CAC', 4436.7, -23, 0.54),
	(5012, 'DAX', 10596, -79.89, -0.75);
/*!40000 ALTER TABLE `stockticker` ENABLE KEYS */;

-- Dumping structure for table trademarket.topnews
CREATE TABLE IF NOT EXISTS `topnews` (
  `topnews_id` int(20) NOT NULL,
  `topnews_name` varchar(300) NOT NULL,
  `topnews_url` varchar(300) DEFAULT NULL,
  `news_id` int(20) DEFAULT NULL,
  `created_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`topnews_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table trademarket.topnews: ~8 rows (approximately)
/*!40000 ALTER TABLE `topnews` DISABLE KEYS */;
INSERT INTO `topnews` (`topnews_id`, `topnews_name`, `topnews_url`, `news_id`, `created_date`) VALUES
	(215, 'InterGlobe Aviation shares slip ahead of $616 million QIP', '', 325, '2017-10-05 22:53:21'),
	(216, 'Suditi Industries surges on deal with Anushka Sharmas company\r\n', '', 326, '2017-10-05 22:53:21'),
	(217, 'Market Now: Broader midcap and smallcap indices outperform benchmarks', '', 327, '2017-10-05 22:53:21'),
	(218, 'Bullet train project: BHEL rallies on rolling stock contract', '', 328, '2017-10-05 22:53:21'),
	(219, 'BPCL, HPCL and IOC rally as Pradhan says no to fuel price intervention', '', 329, '2017-10-05 22:53:21'),
	(221, 'Market Now: Divis Lab, RIL among most active stocks in terms of value.', '', 331, '2017-10-05 22:53:21'),
	(223, 'MFIs role as banking correspondents pays off', '', 333, '2017-10-05 22:53:21'),
	(224, 'Banks shy away from companies facing NCLT action', '', 334, '2017-10-05 22:53:21');
/*!40000 ALTER TABLE `topnews` ENABLE KEYS */;

-- Dumping structure for table trademarket.users
CREATE TABLE IF NOT EXISTS `users` (
  `username` varchar(45) NOT NULL,
  `password` varchar(60) NOT NULL,
  `enabled` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table trademarket.users: ~2 rows (approximately)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`username`, `password`, `enabled`) VALUES
	('alex', '$2a$10$04TVADrR6/SPLBjsK0N30.Jf5fNjBugSACeGv1S69dZALR7lSov0y', 1),
	('mkyong', '$2a$10$04TVADrR6/SPLBjsK0N30.Jf5fNjBugSACeGv1S69dZALR7lSov0y', 1);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

-- Dumping structure for table trademarket.user_roles
CREATE TABLE IF NOT EXISTS `user_roles` (
  `user_role_id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `role` varchar(45) NOT NULL,
  PRIMARY KEY (`user_role_id`),
  UNIQUE KEY `uni_username_role` (`role`,`username`),
  KEY `fk_username_idx` (`username`),
  CONSTRAINT `fk_username` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- Dumping data for table trademarket.user_roles: ~3 rows (approximately)
/*!40000 ALTER TABLE `user_roles` DISABLE KEYS */;
INSERT INTO `user_roles` (`user_role_id`, `username`, `role`) VALUES
	(2, 'mkyong', 'ROLE_ADMIN'),
	(3, 'alex', 'ROLE_USER'),
	(1, 'mkyong', 'ROLE_USER');
/*!40000 ALTER TABLE `user_roles` ENABLE KEYS */;

-- Dumping structure for table trademarket.world
CREATE TABLE IF NOT EXISTS `world` (
  `content_name` varchar(50) NOT NULL,
  `content_id` float NOT NULL,
  `index_name` varchar(50) NOT NULL,
  `price` float NOT NULL,
  `value` float NOT NULL,
  `index_url` varchar(20)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table trademarket.world: ~54 rows (approximately)
/*!40000 ALTER TABLE `world` DISABLE KEYS */;
INSERT INTO `world` (`content_name`, `content_id`, `index_name`, `price`, `value`, `index_url`) VALUES
	('Global', 8101, 'The Global Dow(world)', 2891.23, 3.7, ''),
	('Global', 8102, 'The Global Dow Euro(world)', 2277.47, 6.5, ''),
	('Global', 8103, 'DJ Global Index(world)', 375.18, 4.6, ''),
	('Global', 8104, 'DJ Global ex U.S.(world)', 254.88, 1.6, ''),
	('Asia Pacific', 8105, 'All Ordinaries (Australia)', 5806.4, 1.6, ''),
	('Asia Pacific', 8106, 'S & P/ASX 200 (Australia)', 5746.4, 1.3, ''),
	('Asia Pacific', 8107, 'Dow Jones China 88 (China)', 316.73, 17.9, ''),
	('Asia Pacific', 8108, 'Shanghai Composite (China)', 3379.49, 13.2, ''),
	('Asia Pacific', 8109, 'Hang Seng (Hong Kong)', 27972.2, 4.4, ''),
	('Asia Pacific', 8110, 'S & P BSE Sensex (India)', 32158.7, 5.9, ''),
	('Asia Pacific', 8111, 'Jakarta Composite (Indonesia)', 5872.38, 4.5, ''),
	('Asia Pacific', 8112, 'Nikkei 300 (Japan)', 319.94, 6.5, ''),
	('Asia Pacific', 8113, 'Nikkei Stock Avg (Japan)', 19776.6, 7.4, ''),
	('Asia Pacific', 8114, 'Topix Index (Japan)', 1627.45, 7.4, ''),
	('Asia Pacific', 8115, 'Kuala Lumpur Composite (Malaysia)', 1789.86, 1.2, ''),
	('Asia Pacific', 8116, 'S & P/NZX 50 (New Zealand)', 7840.41, 14.5, ''),
	('Asia Pacific', 8117, 'PSEi (Philippines)', 8049.31, 3.8, ''),
	('Asia Pacific', 8118, 'Straits Times (Singapore)', 3235.69, 1.1, ''),
	('Asia Pacific', 8119, 'Kospi (South Korea)', 2365.47, 5, ''),
	('Asia Pacific', 8120, 'Colombo Stock Exchange (Sri Lanka)', 6377.38, 4, ''),
	('Asia Pacific', 8121, 'Weighted (Taiwan)', 10610.3, 4.8, ''),
	('Asia Pacific', 8122, 'SET (Thailand)', 1643.55, 1.3, ''),
	('Europe', 8123, 'Stoxx Europe 600 (Europe)', 381.42, 3.5, ''),
	('Europe', 8124, 'Stoxx Europe 50 (Europe)', 3104.1, 0.4, ''),
	('Europe', 8125, 'Euro Stoxx 50 (Euro zone)', 3512.56, 2.8, ''),
	('Europe', 8126, 'Euro Stoxx (Euro zone)', 3512.56, 5.5, ''),
	('Europe', 8127, 'ATX (Austria)', 3512.56, 12.5, ''),
	('Europe', 8128, 'Bel-20 (Belgium)', 3995.2, 8, ''),
	('Europe', 8129, 'PX 50 (Czech Republic)', 3995.2, 1.3, ''),
	('Europe', 8130, 'OMX Copenhagen (Denmark)', 926.33, 10.4, ''),
	('Europe', 8131, 'OMX Helsinki (Finland)', 9615.01, 8, ''),
	('Europe', 8132, 'CAC 40 (France)', 5209.01, 5.5, ''),
	('Europe', 8133, 'DAX (Germany)', 12524.8, 9.1, ''),
	('Europe', 8134, 'BUX (Hungary)', 38076.9, 26.8, ''),
	('Europe', 8135, 'FTSE MIB (Italy)', 22233.4, 1.8, ''),
	('Europe', 8136, 'AEX (Netherlands)', 526.58, 8, ''),
	('Europe', 8137, 'All-Shares (Norway)', 830.6, 6.9, ''),
	('Europe', 8138, 'WIG (Poland)', 64826.1, 6.3, ''),
	('Europe', 8139, 'PSI 20 (Portugal)', 5138.27, 4.5, ''),
	('Europe', 8140, 'RTS Index (Russia)', 1124.23, 2.5, ''),
	('Europe', 8141, 'IBEX 35 (Spain)', 10336.2, 1.7, ''),
	('Europe', 8142, 'SX All Share (Sweden)', 566.01, 8.2, ''),
	('Europe', 8143, 'Swiss Market (Switzerland', 9053.62, 1, ''),
	('Europe', 8144, 'BIST 100 (Turkey)', 109130, 11.9, ''),
	('Europe', 8145, 'FTSE 100 (U.K.)', 7400.69, 2.8, ''),
	('Europe', 8146, 'FTSE 250 (U.K.)', 19665.9, 7.8, ''),
	('Americas', 8147, 'DJ Americas (Americas)', 602.56, 6.8, ''),
	('Americas', 8148, 'Merval (Argentina)', 23529.2, 28.6, ''),
	('Americas', 8149, 'Sao Paulo Bovespa (Brazil)', 74538.5, 9.4, ''),
	('Americas', 8150, 'S & P/TSX Comp (Canada)', 15143.4, 0.8, ''),
	('Americas', 8151, 'Santiago IPSA (Chile)', 3925, 6, ''),
	('Americas', 8152, 'IPC All-Share (Mexico)', 50481, 3.3, ''),
	('Other Countries', 8153, 'Tel Aviv (Israel)', 1412.6, 0.3, ''),
	('Other Countries', 8154, 'Johannesburg All Share (South Africa)', 56366.2, 3.2, '');
/*!40000 ALTER TABLE `world` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
