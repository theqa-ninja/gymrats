<?php ob_start("ob_gzhandler");
require_once('mustache.php-2.12.0/src/Mustache/Autoloader.php');
Mustache_Autoloader::register();
$mustache = new Mustache_Engine(array(
    'loader' => new Mustache_Loader_FilesystemLoader(dirname(__FILE__).'/views')
    //'cache' => '/var/cache/gymrats'
));

/* page */
$request = parse_url($_SERVER['REQUEST_URI']);
$path = $request["path"];
$base = basename(explode('?', $_SERVER['REQUEST_URI'])[0]);
$class = str_replace('/', '', $path);
if($path == '/') {
    $class="home";
}

// redirect if there's no slash at the end
$lastchar = substr( $path, -1 );
if ( $lastchar != '/' ) {
    if (!$_SERVER['QUERY_STRING'] and !is_file( $_SERVER['DOCUMENT_ROOT'].$path ) and !is_dir( $_SERVER['DOCUMENT_ROOT'].$path )) {
        header("HTTP/1.1 301 Moved Permanently");
        header( "Location: $path/" );
    }
}

?>
<!DOCTYPE html>
<html lang="en">
<head>
    <title></title>
    <meta charset="utf-8">
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width">
    <link rel="stylesheet" href="/css/styles.css">
    <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet"> 
</head>
<body class="<?= $class ?>">
<nav>
    <ul class="inner">
        <li><a href="/">Home</a></li>
        <li><a href="/alleleans/">Alleleans</a></li>
    </ul>
</nav>
<main class="main">
    <div class="inner">
    <?php include('render.php'); ?>
    </div>
</main>
<script src="/js/script.js"></script>
</body>
</html>
<?php ob_end_flush(); ?>