<?php

require_once('car.php');
require_once('uberX.php');
require_once('uberPool.php');
require_once('account.php');

$car = new Car("AW563", new Account("Andres Herrera", "AND98559"));

$car->PrintDataCar();

$uberX = new UberX("CVB123", new Account("Andres Herrera", "AND8573"), "Chevrolet", "Spark");
$uberX->PrintDataCar();

$uberPool = new uberPool("XPS665", new Account("Andrea Paez", "ANDRE123"), "Dodge", "Attitude");
$uberPool->PrintDataCar();

?>