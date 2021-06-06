-- 1
INSERT INTO tb_specifications (engine, automatic_transmission, fuel_tank_capacity, maximum_power, maximum_torque, size, weight) 
VALUES ('2.0L', '6-speed Automatic', '85 (L)', '228 HP', '350 Nm', '4940 x 1960 x 1773 (mm)', 1490);

INSERT INTO tb_car (name, specifications_id,seat_number, status, type, version,price, year_of_manufacture,description) 
VALUES ('VF-e34',1,5,1,'SUV','1.0',590000000,2021,'');

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (1,'Brahminy-White','#e8e9ee','https://shop.vinfastauto.com/on/demandware.static/Sites-app_vinfast_vn-Site/-/default/dwd1d81acc/images/vfe34/Hinh-anh-dat-coc-xe-dien-VinFast-VFe34-mau-trang-Brahminy-White.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (1,'Neptune','#bbc3d4','https://shop.vinfastauto.com/on/demandware.static/Sites-app_vinfast_vn-Site/-/default/dw7ec7a3b5/images/vfe34/Hinh-anh-dat-coc-Xe-dien-VinFast-e34-mau-ghi-Neptune.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (1,'Silver','#f7f8fc','https://shop.vinfastauto.com/on/demandware.static/Sites-app_vinfast_vn-Site/-/default/dw0bf72786/images/vfe34/Hinh-anh-dat-coc-Xe-dien-VinFast-VFe34-mau-bac-De-sat-Silver.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (1,'Aurora-blue','#2ecdf5','https://shop.vinfastauto.com/on/demandware.static/Sites-app_vinfast_vn-Site/-/default/dwf083927c/images/vfe34/Hinh-anh-dat-coc-Xe-dien-VinFast-e34-mau-xanh-aurora-blue.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (1,'Deep-ocean','#457a58','https://shop.vinfastauto.com/on/demandware.static/Sites-app_vinfast_vn-Site/-/default/dw40e9d0d2/images/vfe34/Hinh-anh-dat-coc-Xe-dien-VinFast-e34-mau-xanh-deep-ocean.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (1,'Mystique-Red','#af2c49','https://shop.vinfastauto.com/on/demandware.static/Sites-app_vinfast_vn-Site/-/default/dw5414b264/images/vfe34/Hinh-anh-dat-coc-Xe-dien-VinFast-VFe34-mau-do-Mystique-Red.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (1,'Jet-Black','#262626','https://shop.vinfastauto.com/on/demandware.static/Sites-app_vinfast_vn-Site/-/default/dwa36026ce/images/vfe34/Hinh-anh-dat-coc-Xe-dien-VinFast-VFe34-mau-den-Jet-Black.png',true);

INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (1,1,10);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (1,2,5);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (1,3,22);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (1,4,13);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (1,5,11);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (1,6,3);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (1,7,2);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (1,9,25);

-- //2

INSERT INTO tb_specifications (engine, automatic_transmission, fuel_tank_capacity, maximum_power, maximum_torque, size, weight) 
VALUES ('V8 6.2L', '8-speed Automatic', '85 (L)', '420 Hp', '624 Nm', '5146 x 1987 x 1760 (mm)', 2424);

INSERT INTO tb_car (name, specifications_id,seat_number, status, type, version,price, year_of_manufacture,description) 
VALUES ('VinFast-PRESIDENT',2,5,1,'SUV','1.0',5900000000,2019,'');

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (2,'CORMORANT BROWN','#3f2030','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dwe4cd4b03/images/PRESIDENT/MD03/CE1I.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (2,'DE SAT SILVER','#f7f8fc','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dwc879a4d2/images/PRESIDENT/MD03/CE17.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (2,'PURPLE RAIN PRA','#3b2f2f','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dwe4cd4b03/images/PRESIDENT/MD03/CE1I.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (2,'BRAHMINY WHITE','#e8e9ee','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw46600a00/images/PRESIDENT/MD03/CE18.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (2,'ACTION ORANGE','#ab4534','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw895aaa31/images/PRESIDENT/MD03/CE15.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (2,'JET BLACK','#262626','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dwb54c39bd/images/PRESIDENT/MD03/CE11.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (2,'LUXURY BLUE','#27314f','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw3683c5a2/images/PRESIDENT/MD03/CE13.png',true);

INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (2,1,10);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (2,2,4);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (2,3,19);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (2,4,13);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (2,5,11);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (2,6,31);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (2,7,23);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (2,9,20);

-- //3

INSERT INTO tb_specifications (engine, automatic_transmission, fuel_tank_capacity, maximum_power, maximum_torque, size, weight) 
VALUES ('2.0L', '8-speed Automatic', '85 (L)', '228 HP', '350 Nm', '4940 x 1960 x 1773 (mm)', 2140);

INSERT INTO tb_car (name, specifications_id,seat_number, status, type, version,price, year_of_manufacture,description) 
VALUES ('VinFast-LUX-SA',3,5,1,'SUV','2.0',1800000000,2020,'');

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (3,'Red','#bd4b57','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dwdf702045/images/LUX-SA/MD04/CE16.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (3,'ORANGE','#e36349','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dwcb8bd556/images/LUX-SA/MD04/CE15.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (3,'BROWN','#3f2030','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw3c6248e1/images/LUX-SA/MD04/CE12.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (3,'LUXURY BLUE','#27314f','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dwfcd4eece/images/LUX-SA/MD04/CE13.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (3,'SILVER','#f7f8fc','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dwda6aab80/images/LUX-SA/MD04/CE17.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (3,'JET BLACK','#262626','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw506d45d2/images/LUX-SA/MD04/CE11.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (3,'BRAHMINY WHITE','#e8e9ee','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dwcad4a978/images/LUX-SA/MD04/CE18.png',true);

INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (3,1,10);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (3,2,4);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (3,3,19);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (3,4,13);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (3,5,11);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (3,6,31);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (3,10,23);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (3,8,20);


-- //4

INSERT INTO tb_specifications (engine, automatic_transmission, fuel_tank_capacity, maximum_power, maximum_torque, size, weight) 
VALUES ('2.0L', '8-speed Automatic', '70 (L)', '174 HP', '300 Nm', '4973 x 1900 x 1464 (mm)', 1795);

INSERT INTO tb_car (name, specifications_id,seat_number, status, type, version,price, year_of_manufacture,description) 
VALUES ('VinFast-LUX-A',4,5,1,'SEDAN','2.0',1300000000,2018,'');

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (4,'Red','#bd4b57','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw2d400207/images/LUX-A/MD11/CE16.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (4,'ORANGE','#e36349','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw98664235/images/LUX-A/MD11/CE15.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (4,'BROWN','#3f2030','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw9d8575f9/images/LUX-A/MD11/CE12.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (4,'LUXURY BLUE','#27314f','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw9d8575f9/images/LUX-A/MD11/CE12.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (4,'SILVER','#f7f8fc','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw95ed46af/images/LUX-A/MD11/CE17.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (4,'JET BLACK','#262626','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw27ed1382/images/LUX-A/MD11/CE11.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (4,'BRAHMINY WHITE','#e8e9ee','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dwc2a41739/images/LUX-A/MD11/CE18.png',true);

INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (4,1,10);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (4,2,4);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (4,3,19);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (4,4,13);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (4,5,11);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (4,8,31);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (4,10,23);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (4,9,20);

-- //5

INSERT INTO tb_specifications (engine, automatic_transmission, fuel_tank_capacity, maximum_power, maximum_torque, size, weight) 
VALUES ('1.4L', 'Biến thiên vô cấp (CVT)', '32 (L)', '98 HP', '128 Nm', '3676 x 1632 x 1495 (mm)', 993);

INSERT INTO tb_car (name, specifications_id,seat_number, status, type, version,price, year_of_manufacture,description) 
VALUES ('VinFast-FADIL',4,5,1,'HATCHBACK','1.0',499000000,2019,'');

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (5,'Red','#bd4b57','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw18fe64bf/images/FADIL/SMC/CE16.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (5,'ORANGE','#e36349','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw8dfc0755/images/FADIL/SMC/CE15.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (5,'BROWN','#3f2030','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dwaaab9f32/images/FADIL/SMC/CE14.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (5,'LUXURY BLUE','#27314f','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw6f758104/images/FADIL/SMC/CE13.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (5,'SILVER','#f7f8fc','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw6cc2ec7d/images/FADIL/SMC/CE17.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (5,'GREEN','#184933','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw79dc961d/images/FADIL/SMC/CE1H.png',true);

INSERT INTO tb_car_color (car_id, name,code,imageURL,is_active)
VALUES (5,'BRAHMINY WHITE','#e8e9ee','https://shop.vinfastauto.com/on/demandware.static/-/Sites-vinfast_vn_master/default/dw266c9265/images/FADIL/SMC/CE18.png',true);

INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (5,1,11);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (5,2,7);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (5,3,21);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (5,4,24);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (5,5,33);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (5,6,14);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (5,7,16);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (5,8,41);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (5,10,23);
INSERT INTO tb_showroom_car (car_id, showroom_id,quantity)
VALUES (5,9,20);