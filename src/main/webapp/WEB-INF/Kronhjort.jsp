<%--
  Created by IntelliJ IDEA.
  User: nbh
  Date: 28/04/2022
  Time: 10.56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Min sinde</title>
</head>
<body>

<h1>Så fandt du din kronhjort ! </h1>

Klokken er ${requestScope.tid}, så vi skal snart have frokost !


<form action="fc/login" method="post">
    <input type="hidden" name="command" value="otto"/>
    <input type="submit"  value="gå til otto"/>
</form>


<form action="fc/login" method="post">
    <input type="hidden" name="command" value="march"/>
    <input type="submit"  value="gå til march"/>
</form>



<form action="fc/login" method="post">
    <input type="hidden" name="command" value="timmi"/>
    <input type="submit"  value="gå til timmi"/>
</form>

<form action="fc/login" method="post">
    <input type="hidden" name="command" value="fiskbak"/>
    <input type="submit"  value="gå til fiskbak"/>
</form>


<form action="fc/login" method="post">
    <input type="hidden" name="command" value="brandt"/>
    <input type="submit"  value="gå til brandt"/>
</form>






</body>
</html>
