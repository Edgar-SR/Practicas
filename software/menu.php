<?php
	session_start();
	if(!isset($_SESSION['usuarios']))
		header("Location:index.html");
?>
<<html>
<head>
	<title>MENU</title>
</head>
<body>
	<h1>Agencia de automotrices/h1><br>
	<a href = "logout.php"> Cerrar sesion </a>
</body>
</html>