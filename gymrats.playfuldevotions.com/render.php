<?php
/* Helix API */
// $helix_contents = file_get_contents('https://gymrats.herokuapp.com/api/helix');
// $helix_array = json_decode(str_replace('xml', 'svg', $helix_contents), true);

/* Fitbit API */
$fitbit_content = file_get_contents('https://gymrats.herokuapp.com/api/users/6');
$fitbit_array = json_decode($fitbit_content, true);

/* Alleleans API */
$alleleans_contents = file_get_contents('https://gymrats.herokuapp.com/api/alleleans', true);
$alleleans_contents = str_replace(']', ']}', str_replace('[', '{"alleleans":[', $alleleans_contents));
$alleleans_array = json_decode($alleleans_contents);

// $creature_details_content = $mustache->loadTemplate('creature_details');
// $creature_details = $creatures_details_content->render($);
// $dashboard_content = $mustache->loadTemplate('dashboard');
// $dashboard = $dashboard_content->render($gen_contents);
if($path == '/') {
    $dash_content = file_get_contents('https://gymrats.herokuapp.com/api/alleleans/search/?query=gym_rat', true);
    $dash_content = str_replace(']', '', str_replace('[','', $dash_content));

    $dash_array = json_decode($dash_content);
    $dash_content = $mustache->loadTemplate('dashboard');
    $dash = $dash_content->render($dash_array);
    echo $dash;

    $fitbit_content = $mustache->loadTemplate('fitbit');
    $fitbit = $fitbit_content->render($fitbit_array);
    echo $fitbit;
}
if($path == 'recommendations') {
    $recommend_content = file_get_contents('/json/recommendations.json', true);
    $recommend_array = json_decode($recommend_content);
    $recommend_contents = $mustache->loadTemplate('creature_details');
    $recommend = $recommend_contents->render($recommend_array);
    var_dump('working');
}
if(strpos($path, '/alleleans') !== false) {
    if($path == '/alleleans/') {
        $list_allelean_content = $mustache->loadTemplate('list_allelean');
        $list_allelean = $list_allelean_content->render($alleleans_array);
        echo $list_allelean;
    }
    else {
        /* Single Allelean */
        $allelean_content = file_get_contents('https://gymrats.herokuapp.com/api/alleleans/search/?query='.$base, true);
        $allelean_content = str_replace(']', '', str_replace('[','', $allelean_content));
        $allelean_array = json_decode($allelean_content);
        $allelean_contents = $mustache->loadTemplate('creature_details');
        $allelean = $allelean_contents->render($allelean_array);
        echo $allelean;
    }
}