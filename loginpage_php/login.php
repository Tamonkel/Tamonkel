<?php
session_start();

$username =  $_POST['username'] ?? '';
$password =  $_POST['password'] ?? '';

if($username == 'Tamonkel' && $password == 'geheim' ) {
    $_SESSION['logged_in'] = true;
    header("Location: success.php");
    exit;
} else {
    header("Location: fail.html");
    exit;;
}
?>