<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<!--[if lt IE 9]><html class="lte-ie8" lang=""><![endif]-->
<!--[if gt IE 8]><!-->
<html lang="">
<!--<![endif]-->
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />

<title>IG Calculator</title>

<script type="text/javascript">
	(function() {
		if (navigator.userAgent.match(/IEMobile\/10\.0/)) {
			var d = document, c = "appendChild", a = d.createElement("style");
			a[c](d.createTextNode("@-ms-viewport{width:auto!important}"));
			d.getElementsByTagName("head")[0][c](a);
		}
	})();
</script>

<!--[if gt IE 8]><!-->
<link
	href="<c:url value="/resources/stylesheets/govuk-template.css?0.15.1" />"
	media="screen" rel="stylesheet" type="text/css" />
<!--<![endif]-->
<!--[if IE 6]><link href="<c:url value="/resources/stylesheets/govuk-template-ie6.css?0.15.1" />" media="screen" rel="stylesheet" type="text/css" /><![endif]-->
<!--[if IE 7]><link href="<c:url value="/resources/stylesheets/govuk-template-ie7.css?0.15.1" />" media="screen" rel="stylesheet" type="text/css" /><![endif]-->
<!--[if IE 8]><link href="<c:url value="/resources/stylesheets/govuk-template-ie8.css?0.15.1" />" media="screen" rel="stylesheet" type="text/css" /><![endif]-->

<link
	href="<c:url value="/resources/stylesheets/govuk-template-print.css?0.15.1" />"
	media="print" rel="stylesheet" type="text/css" />

<!--[if IE 8]>
    <script type="text/javascript">
      (function(){if(window.opera){return;}
       setTimeout(function(){var a=document,g,b={families:(g=
       ["nta"]),urls:["/resources/stylesheets/fonts-ie8.css?0.15.1"]},
       c="/resources/javascripts/vendor/goog/webfont-debug.js?0.15.1",d="script",
       e=a.createElement(d),f=a.getElementsByTagName(d)[0],h=g.length;WebFontConfig
       ={custom:b},e.src=c,f.parentNode.insertBefore(e,f);for(;h=h-1;a.documentElement
       .className+=' wf-'+g[h].replace(/\s/g,'').toLowerCase()+'-n4-loading');},0)
      })()
    </script>
    <![endif]-->
<!--[if gte IE 9]><!-->
<link href="<c:url value="/resources/stylesheets/fonts.css?0.15.1" />"
	media="all" rel="stylesheet" type="text/css" />
<!--<![endif]-->


<!--[if lt IE 9]>
      <script src="<c:url value="/resources/javascripts/ie.js?0.15.1" />" type="text/javascript"></script>
    <![endif]-->

<link rel="shortcut icon"
	href="<c:url value="/resources/images/favicon.ico?0.15.1" />"
	type="image/x-icon" />

<!-- Size for iPad and iPad mini (high resolution) -->
<link rel="apple-touch-icon-precomposed" sizes="152x152"
	href="<c:url value="/resources/images/apple-touch-icon-152x152.png?0.15.1" />">
<!-- Size for iPhone and iPod touch (high resolution) -->
<link rel="apple-touch-icon-precomposed" sizes="120x120"
	href="<c:url value="/resources/images/apple-touch-icon-120x120.png?0.15.1" />">
<!-- Size for iPad 2 and iPad mini (standard resolution) -->
<link rel="apple-touch-icon-precomposed" sizes="76x76"
	href="<c:url value="/resources/images/apple-touch-icon-76x76.png?0.15.1" />">
<!-- Default non-defined size, also used for Android 2.1+ devices -->
<link rel="apple-touch-icon-precomposed"
	href="<c:url value="/resources/images/apple-touch-icon-60x60.png?0.15.1" />">

<meta name="viewport" content="width=device-width, initial-scale=1">
<meta property="og:image"
	content="<c:url value="/resources/images/opengraph-image.png?0.15.1" />">

<c:import url="/WEB-INF/views/includes/head.jsp"></c:import>

<c:import url="/WEB-INF/views/includes/scripts.jsp"></c:import>
<body class="">
	<script type="text/javascript">
		document.body.className = ((document.body.className) ? document.body.className
				+ ' js-enabled'
				: 'js-enabled');
	</script>



	<div id="skiplink-container">
		<div>
			<a href="#content" class="skiplink">Skip to main content</a>
		</div>
	</div>

	<div id="global-cookie-message"></div>
	<!--end global-cookie-message-->


	<header role="banner" id="global-header" class="with-proposition">
		<div class="header-wrapper">
			<div class="header-global">
				<div class="header-logo">
					<a href="https://www.gov.uk" title="Go to the GOV.UK homepage"
						id="logo" class="content"> <img
						src="resources/images/gov.uk_logotype_crown_invert_trans.png?0.15.1"
						width="35" height="31" alt=""> GOV.UK
					</a>
				</div>
			</div>
			<!-- div class="header-proposition">
				<div class="content">
					<a href="#proposition-links" class="js-header-toggle menu">Menu</a>
					<nav id="proposition-menu">
						<a href="/" id="proposition-name">IG Calculator</a>
					</nav>
				</div>
			</div-->
			<c:import url="/WEB-INF/views/includes/propositional_navigation.jsp"></c:import>
		</div>
	</header>
	<!--end header-->



	<div id="global-header-bar"></div>
	<!--end global-header-bar-->