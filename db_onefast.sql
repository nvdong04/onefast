-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 13, 2021 lúc 07:05 PM
-- Phiên bản máy phục vụ: 10.4.11-MariaDB
-- Phiên bản PHP: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `onefast`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tb_booking_drive_test`
--

CREATE TABLE `tb_booking_drive_test` (
  `id` bigint(20) NOT NULL,
  `drive_date` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `email` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `fullname` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `phone` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `car_id` bigint(20) DEFAULT NULL,
  `showroom_id` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tb_booking_drive_test`
--

INSERT INTO `tb_booking_drive_test` (`id`, `drive_date`, `email`, `fullname`, `phone`, `status`, `car_id`, `showroom_id`) VALUES
(1, '2021-06-06', 'nvdong@gmail.com', 'Nguyễn Văn Đông', '0987782326', 1, 1, 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tb_car`
--

CREATE TABLE `tb_car` (
  `id` bigint(20) NOT NULL,
  `description` text COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `price` float DEFAULT NULL,
  `seat_number` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `type` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `version` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `year_of_manufacture` int(11) DEFAULT NULL,
  `specifications_id` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tb_car`
--

INSERT INTO `tb_car` (`id`, `description`, `name`, `price`, `seat_number`, `status`, `type`, `version`, `year_of_manufacture`, `specifications_id`) VALUES
(1, '', 'VF-e34', 590000000, 5, 1, 'SUV', '1.0', 2021, 1),
(2, '', 'VinFast-PRESIDENT', 5900000000, 5, 1, 'SUV', '1.0', 2019, 2),
(3, '', 'VinFast-LUX-SA', 1800000000, 5, 1, 'SUV', '2.0', 2020, 3),
(4, '', 'VinFast-LUX-A', 1300000000, 5, 1, 'SEDAN', '2.0', 2018, 4),
(5, '', 'VinFast-FADIL', 499000000, 5, 1, 'HATCHBACK', '1.0', 2019, 4);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tb_car_color`
--

CREATE TABLE `tb_car_color` (
  `id` bigint(20) NOT NULL,
  `code` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `imageurl` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `is_active` bit(1) DEFAULT NULL,
  `name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `car_id` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tb_car_color`
--

INSERT INTO `tb_car_color` (`id`, `code`, `imageurl`, `is_active`, `name`, `car_id`) VALUES
(1, '#e8e9ee', 'https://shop.vinfastauto.com/on/demandware.static/Sites-app_vinfast_vn-Site/-/default/dwd1d81acc/images/vfe34/Hinh-anh-dat-coc-xe-dien-VinFast-VFe34-mau-trang-Brahminy-White.png', b'1', 'Brahminy-White', 1),
(2, '#bbc3d4', 'https://shop.vinfastauto.com/on/demandware.static/Sites-app_vinfast_vn-Site/-/default/dw7ec7a3b5/images/vfe34/Hinh-anh-dat-coc-Xe-dien-VinFast-e34-mau-ghi-Neptune.png', b'1', 'Neptune', 1),
(3, '#f7f8fc', 'https://shop.vinfastauto.com/on/demandware.static/Sites-app_vinfast_vn-Site/-/default/dw0bf72786/images/vfe34/Hinh-anh-dat-coc-Xe-dien-VinFast-VFe34-mau-bac-De-sat-Silver.png', b'1', 'Silver', 1),
(4, '#2ecdf5', 'https://shop.vinfastauto.com/on/demandware.static/Sites-app_vinfast_vn-Site/-/default/dwf083927c/images/vfe34/Hinh-anh-dat-coc-Xe-dien-VinFast-e34-mau-xanh-aurora-blue.png', b'1', 'Aurora-blue', 1),
(5, '#457a58', 'https://shop.vinfastauto.com/on/demandware.static/Sites-app_vinfast_vn-Site/-/default/dw40e9d0d2/images/vfe34/Hinh-anh-dat-coc-Xe-dien-VinFast-e34-mau-xanh-deep-ocean.png', b'1', 'Deep-ocean', 1),
(6, '#af2c49', 'https://shop.vinfastauto.com/on/demandware.static/Sites-app_vinfast_vn-Site/-/default/dw5414b264/images/vfe34/Hinh-anh-dat-coc-Xe-dien-VinFast-VFe34-mau-do-Mystique-Red.png', b'1', 'Mystique-Red', 1),
(7, '#262626', 'https://shop.vinfastauto.com/on/demandware.static/Sites-app_vinfast_vn-Site/-/default/dwa36026ce/images/vfe34/Hinh-anh-dat-coc-Xe-dien-VinFast-VFe34-mau-den-Jet-Black.png', b'1', 'Jet-Black', 1),
(8, '#3f2030', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dwe4cd4b03/images/PRESIDENT/MD03/CE1I.png', b'1', 'CORMORANT BROWN', 2),
(9, '#f7f8fc', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dwc879a4d2/images/PRESIDENT/MD03/CE17.png', b'1', 'DE SAT SILVER', 2),
(10, '#3b2f2f', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dwe4cd4b03/images/PRESIDENT/MD03/CE1I.png', b'1', 'PURPLE RAIN PRA', 2),
(11, '#e8e9ee', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw46600a00/images/PRESIDENT/MD03/CE18.png', b'1', 'BRAHMINY WHITE', 2),
(12, '#ab4534', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw895aaa31/images/PRESIDENT/MD03/CE15.png', b'1', 'ACTION ORANGE', 2),
(13, '#262626', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dwb54c39bd/images/PRESIDENT/MD03/CE11.png', b'1', 'JET BLACK', 2),
(14, '#27314f', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw3683c5a2/images/PRESIDENT/MD03/CE13.png', b'1', 'LUXURY BLUE', 2),
(15, '#bd4b57', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dwdf702045/images/LUX-SA/MD04/CE16.png', b'1', 'Red', 3),
(16, '#e36349', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dwcb8bd556/images/LUX-SA/MD04/CE15.png', b'1', 'ORANGE', 3),
(17, '#3f2030', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw3c6248e1/images/LUX-SA/MD04/CE12.png', b'1', 'BROWN', 3),
(18, '#27314f', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dwfcd4eece/images/LUX-SA/MD04/CE13.png', b'1', 'LUXURY BLUE', 3),
(19, '#f7f8fc', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dwda6aab80/images/LUX-SA/MD04/CE17.png', b'1', 'SILVER', 3),
(20, '#262626', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw506d45d2/images/LUX-SA/MD04/CE11.png', b'1', 'JET BLACK', 3),
(21, '#e8e9ee', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dwcad4a978/images/LUX-SA/MD04/CE18.png', b'1', 'BRAHMINY WHITE', 3),
(22, '#bd4b57', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw2d400207/images/LUX-A/MD11/CE16.png', b'1', 'Red', 4),
(23, '#e36349', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw98664235/images/LUX-A/MD11/CE15.png', b'1', 'ORANGE', 4),
(24, '#3f2030', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw9d8575f9/images/LUX-A/MD11/CE12.png', b'1', 'BROWN', 4),
(25, '#27314f', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw9d8575f9/images/LUX-A/MD11/CE12.png', b'1', 'LUXURY BLUE', 4),
(26, '#f7f8fc', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw95ed46af/images/LUX-A/MD11/CE17.png', b'1', 'SILVER', 4),
(27, '#262626', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw27ed1382/images/LUX-A/MD11/CE11.png', b'1', 'JET BLACK', 4),
(28, '#e8e9ee', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dwc2a41739/images/LUX-A/MD11/CE18.png', b'1', 'BRAHMINY WHITE', 4),
(29, '#bd4b57', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw18fe64bf/images/FADIL/SMC/CE16.png', b'1', 'Red', 5),
(30, '#e36349', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw8dfc0755/images/FADIL/SMC/CE15.png', b'1', 'ORANGE', 5),
(31, '#3f2030', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dwaaab9f32/images/FADIL/SMC/CE14.png', b'1', 'BROWN', 5),
(32, '#27314f', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw6f758104/images/FADIL/SMC/CE13.png', b'1', 'LUXURY BLUE', 5),
(33, '#f7f8fc', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw6cc2ec7d/images/FADIL/SMC/CE17.png', b'1', 'SILVER', 5),
(34, '#184933', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw79dc961d/images/FADIL/SMC/CE1H.png', b'1', 'GREEN', 5),
(35, '#e8e9ee', 'https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw266c9265/images/FADIL/SMC/CE18.png', b'1', 'BRAHMINY WHITE', 5);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tb_order`
--

CREATE TABLE `tb_order` (
  `id` bigint(20) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `discount` float DEFAULT NULL,
  `modified_at` datetime DEFAULT NULL,
  `payment_method` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `car_id` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tb_order`
--

INSERT INTO `tb_order` (`id`, `created_at`, `discount`, `modified_at`, `payment_method`, `status`, `user_id`, `car_id`) VALUES
(1, '2021-06-13 17:01:39', 5, '2021-06-13 17:01:39', 'Trả thẳng', 1, 2, 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tb_role`
--

CREATE TABLE `tb_role` (
  `id` bigint(20) NOT NULL,
  `added_by` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `description` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `modified_by` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tb_role`
--

INSERT INTO `tb_role` (`id`, `added_by`, `description`, `modified_by`, `name`) VALUES
(1, NULL, 'Role admin', NULL, 'ROLE_ADMIN'),
(2, NULL, 'role user', NULL, 'ROLE_USER');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tb_showroom`
--

CREATE TABLE `tb_showroom` (
  `id` bigint(20) NOT NULL,
  `address` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `city` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `hotline` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `model` int(11) DEFAULT NULL,
  `name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `status` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tb_showroom`
--

INSERT INTO `tb_showroom` (`id`, `address`, `city`, `hotline`, `model`, `name`, `status`) VALUES
(1, 'Tầng L1, Vincom Centre Landmark 81, 208 Nguyễn Hữu Cảnh, Q. Bình Thạnh, Hồ Chí Minh', 'Hồ Chí Minh', '0981335512', 1, 'Showroom VinFast Landmark 81', 1),
(2, 'Số 1 Đường Nguyễn Văn Linh, Phường Gia Thụy, Quận Long Biên, Thành phố Hà Nội', 'Hà Nội', '1900636903', 3, 'Showroom VinFast - Chevrolet Đại Việt', 1),
(3, 'Số 166 Phạm Văn Đồng, Phường Xuân Đỉnh, Quận Bắc Từ Liêm, Thành phố Hà Nội', 'Hà Nội', '0866391155', 3, 'Showroom VinFast Phạm Văn Đồng', 1),
(4, 'Phố Mới, Đội 1, xã Tân Dương, huyện Thủy Nguyên, Hải Phòng', 'Hải Phòng', '0904231009', 2, 'Showroom VIN3S Thủy Nguyên', 1),
(5, '1-3 Nguyễn Lương Bằng, P. 9, TP. Vũng Tàu, Bà Rịa - Vũng Tàu', 'Bà Rịa - Vũng Tàu', '0933866989', 2, 'Showroom VIN3S Vũng Tàu', 1),
(6, '328 Đường Độc Lập, Khu phố Quảng Phú, P. Phú Mỹ, TX. Phú Mỹ, Bà Rịa - Vũng Tàu', 'Bà Rịa - Vũng Tàu', '0902912022', 4, 'Showroom VIN3S Phú Mỹ', 1),
(7, '288 đường Hai Bà Trưng, tổ 4, P. Hùng Vương, TP. Phúc Yên, Vĩnh Phúc', 'Vĩnh Phúc', '0947105662', 3, 'Showroom VIN3S Phúc Yên', 1),
(8, 'Tổ 10, P. Phan Thiết, TP. Tuyên Quang', 'Tuyên Quang', '0932118188', 3, 'Showroom VIN3S Tuyên Quang', 1),
(9, '136,138 đường Quang Trung, P. Hải Hòa, Nghi Sơn, Thanh Hóa', 'Thanh Hóa', '0865723689', 3, 'Showroom VIN3S Nghi Sơn', 1),
(10, 'Phố Đình, Thị Trấn Hùng Sơn, Huyện Đại Từ, Thái Nguyên', 'Thái Nguyên', '0934967338', 5, 'Showroom VIN3S Đại Từ', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tb_showroom_car`
--

CREATE TABLE `tb_showroom_car` (
  `id` bigint(20) NOT NULL,
  `quantity` int(11) DEFAULT 0,
  `car_id` bigint(20) DEFAULT NULL,
  `showroom_id` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tb_showroom_car`
--

INSERT INTO `tb_showroom_car` (`id`, `quantity`, `car_id`, `showroom_id`) VALUES
(1, 10, 1, 1),
(2, 5, 1, 2),
(3, 22, 1, 3),
(4, 13, 1, 4),
(5, 11, 1, 5),
(6, 3, 1, 6),
(7, 2, 1, 7),
(8, 25, 1, 9),
(9, 10, 2, 1),
(10, 4, 2, 2),
(11, 19, 2, 3),
(12, 13, 2, 4),
(13, 11, 2, 5),
(14, 31, 2, 6),
(15, 23, 2, 7),
(16, 20, 2, 9),
(17, 10, 3, 1),
(18, 4, 3, 2),
(19, 19, 3, 3),
(20, 13, 3, 4),
(21, 11, 3, 5),
(22, 31, 3, 6),
(23, 23, 3, 10),
(24, 20, 3, 8),
(25, 10, 4, 1),
(26, 4, 4, 2),
(27, 19, 4, 3),
(28, 13, 4, 4),
(29, 11, 4, 5),
(30, 31, 4, 8),
(31, 23, 4, 10),
(32, 20, 4, 9),
(33, 11, 5, 1),
(34, 7, 5, 2),
(35, 21, 5, 3),
(36, 24, 5, 4),
(37, 33, 5, 5),
(38, 14, 5, 6),
(39, 16, 5, 7),
(40, 41, 5, 8),
(41, 23, 5, 10),
(42, 20, 5, 9);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tb_specifications`
--

CREATE TABLE `tb_specifications` (
  `id` bigint(20) NOT NULL,
  `automatic_transmission` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `engine` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `fuel_tank_capacity` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `maximum_power` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `maximum_torque` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `size` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `weight` float DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tb_specifications`
--

INSERT INTO `tb_specifications` (`id`, `automatic_transmission`, `engine`, `fuel_tank_capacity`, `maximum_power`, `maximum_torque`, `size`, `weight`) VALUES
(1, '6-speed Automatic', '2.0L', '85 (L)', '228 HP', '350 Nm', '4940 x 1960 x 1773 (mm)', 1490),
(2, '8-speed Automatic', 'V8 6.2L', '85 (L)', '420 Hp', '624 Nm', '5146 x 1987 x 1760 (mm)', 2424),
(3, '8-speed Automatic', '2.0L', '85 (L)', '228 HP', '350 Nm', '4940 x 1960 x 1773 (mm)', 2140),
(4, '8-speed Automatic', '2.0L', '70 (L)', '174 HP', '300 Nm', '4973 x 1900 x 1464 (mm)', 1795),
(5, 'Biến thiên vô cấp (CVT)', '1.4L', '32 (L)', '98 HP', '128 Nm', '3676 x 1632 x 1495 (mm)', 993);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tb_user`
--

CREATE TABLE `tb_user` (
  `id` bigint(20) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `email` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `fullname` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `is_active` bit(1) DEFAULT NULL,
  `modified_at` datetime DEFAULT NULL,
  `password` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `phone` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tb_user`
--

INSERT INTO `tb_user` (`id`, `created_at`, `email`, `fullname`, `is_active`, `modified_at`, `password`, `phone`) VALUES
(1, '2021-06-09 23:57:35', 'admin@onefast.com', 'admin', b'1', '2021-06-09 23:57:35', '$2a$10$F9RC8nxW3VZjNqiwqnRg1.oCTQtHnmTGt/E1I/98Hl5Tg3DBg1KqS', NULL),
(2, '2021-06-09 23:57:36', 'usertest@onefast.com', 'usertest', b'1', '2021-06-09 23:57:36', '$2a$10$.q9iDT4kAIaj1cf7.q6SS.0r.vezI4sFfJ1TFmsQ265ROFHAH5afW', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tb_user_role`
--

CREATE TABLE `tb_user_role` (
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tb_user_role`
--

INSERT INTO `tb_user_role` (`user_id`, `role_id`) VALUES
(1, 1),
(2, 2);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `tb_booking_drive_test`
--
ALTER TABLE `tb_booking_drive_test`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKola414xcwuoe9n66gqrc087vr` (`car_id`),
  ADD KEY `FK5c3vraqm70tecfmwk7xoqej1e` (`showroom_id`);

--
-- Chỉ mục cho bảng `tb_car`
--
ALTER TABLE `tb_car`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKqsd4xtdhxckxp92sxisfr85dt` (`specifications_id`);

--
-- Chỉ mục cho bảng `tb_car_color`
--
ALTER TABLE `tb_car_color`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK2hs3538bred5xiqo49v28djnp` (`car_id`);

--
-- Chỉ mục cho bảng `tb_order`
--
ALTER TABLE `tb_order`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKsua6o58o85tbhoa26phke1een` (`car_id`);

--
-- Chỉ mục cho bảng `tb_role`
--
ALTER TABLE `tb_role`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `tb_showroom`
--
ALTER TABLE `tb_showroom`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `tb_showroom_car`
--
ALTER TABLE `tb_showroom_car`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK2psewvyiquxpwe8m873rnhge3` (`car_id`),
  ADD KEY `FKsw0tgio7yrscqvpemu1i71njf` (`showroom_id`);

--
-- Chỉ mục cho bảng `tb_specifications`
--
ALTER TABLE `tb_specifications`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `tb_user_role`
--
ALTER TABLE `tb_user_role`
  ADD KEY `FKea2ootw6b6bb0xt3ptl28bymv` (`role_id`),
  ADD KEY `FK7vn3h53d0tqdimm8cp45gc0kl` (`user_id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `tb_booking_drive_test`
--
ALTER TABLE `tb_booking_drive_test`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT cho bảng `tb_car`
--
ALTER TABLE `tb_car`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `tb_car_color`
--
ALTER TABLE `tb_car_color`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT cho bảng `tb_order`
--
ALTER TABLE `tb_order`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT cho bảng `tb_role`
--
ALTER TABLE `tb_role`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `tb_showroom`
--
ALTER TABLE `tb_showroom`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT cho bảng `tb_showroom_car`
--
ALTER TABLE `tb_showroom_car`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT cho bảng `tb_specifications`
--
ALTER TABLE `tb_specifications`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `tb_user`
--
ALTER TABLE `tb_user`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
