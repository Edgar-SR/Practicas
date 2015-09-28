<?php
	session_start();
	unset($_SESSION['usuarios']);
	session_destroy();
	header("Location:index.html");

?>