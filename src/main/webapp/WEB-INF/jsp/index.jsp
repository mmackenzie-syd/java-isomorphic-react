<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

    <head>
        <title>Nashorn Rendering Example</title>
        <meta charset="utf-8" />
        <!--[if lt IE 9]>
        <script src="//cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.2/html5shiv.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.2/html5shiv-printshiv.js"></script>
        <![endif]-->
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/codemirror/5.0.0/theme/monokai.min.css"/>
    </head>
    <body>
        <div class="js-content">${content}</div>
        <script>window.__state__=${data}</script>

        <!--[if lt IE 9]>{{! Polyfills before JS }}
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>{{! react-bootstrap }}
        <script src="//cdnjs.cloudflare.com/ajax/libs/es5-shim/4.1.1/es5-shim.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/es5-shim/4.1.1/es5-sham.min.js"></script>
        <![endif]-->
        <script src="bundle.js"></script>
    </body>
</html>