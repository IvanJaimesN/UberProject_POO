<?php

require_once('car.php');
require_once('account.php');

$car = new Car("AW563", new Account("Andres Herrera", "AND98559"));

$car->PrintDataCar();