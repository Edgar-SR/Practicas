<?php
	$conexion = mysql_connect("localhost", "root", "");
	mysql_select_db("automotriz", $conexion);
	$usuario = $_POST['nombre'];
	$pass = $_POST['pass'];
	$query = "SELECT Nombre FROM usuarios WHERE Nombre = '$usuario' AND Pass = SHA1('$pass')";
	$res = mysql_query($query);
	$valido = mysql_fetch_array($res);
	if(isset($valido['Nombre']))
	{
		session_start();
		$_SESSION['usuarios'] = $valido['Nombre'];
		header("Location: menu.php");
	}
	else
	{
		header("Location index.html");
	}

?>