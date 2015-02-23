<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>




<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="favicon.ico">

<!-- Bootstrap core CSS -->
<link href="/Simple-Blog/staticContent/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/Simple-Blog/staticContent/css/main.css" rel="stylesheet">

<script
	src="staticContent/js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->


<sj:head jquerytheme="humanity" debug="true" />

<s:debug />
<s:property value="#session" />

<script type="text/javascript">
<!--

function createRequestObject() {
    var tmpXmlHttpObject;
    
    //depending on what the browser supports, use the right way to create the XMLHttpRequest object
    if (window.XMLHttpRequest) { 
        // Mozilla, Safari would use this method ...
        tmpXmlHttpObject = new XMLHttpRequest();
	
    } else if (window.ActiveXObject) { 
        // IE would use this method ...
        tmpXmlHttpObject = new ActiveXObject("Microsoft.XMLHTTP");
    }
    
    return tmpXmlHttpObject;
}

//call the above function to create the XMLHttpRequest object
var http = createRequestObject();

function makeGetRequest(wordId) {
    //make a connection to the server ... specifying that you intend to make a GET request 
    //to the server. Specifiy the page name and the URL parameters to send
    http.open('get', 'index?id=' + wordId);
	
    //assign a handler for the response
    http.onreadystatechange = processResponse;
	
    //actually send the request to the server
    http.send(null);
}

function processResponse() {
    //check if the response has been received from the server
    if(http.readyState == 4){
	
        //read and assign the response from the server
        var response = http.responseText;
		
        //do additional parsing of the response, if needed
		
        //in this case simply assign the response to the contents of the <div> on the page. 
        document.getElementById('description').innerHTML = 'toto';
		
        //If the server returned an error message like a 404 error, that message would be shown within the div tag!!. 
        //So it may be worth doing some basic error before setting the contents of the <div>
    }
}

-->
</script>

