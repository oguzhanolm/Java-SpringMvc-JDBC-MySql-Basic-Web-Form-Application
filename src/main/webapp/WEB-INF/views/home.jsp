<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
input[type=text],[type=tel],[type=number],[type=email],[type=date],textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  resize: vertical;
}
.button {
  border: none;
  color: white;
  padding: 16px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  transition-duration: 0.4s;
  cursor: pointer;
}

.button1 {
  background-color: white;
  opacity:0.9; 
  color: black; 
  border: 2px solid #206040;
}

.button1:hover {
  background-color: #206040;
  opacity:0.9; 
  color: white;
}

body {
  font-family: Lucida Sans Unicode;
  background-image: url("http://bgfons.com/uploads/lines/lines_texture1100.jpg");
  margin: 0;
}

.header {
  padding: 15px;
  background: #206040;
  color: white;
  font-size: 15px;
  opacity: 0.9;
}

.content {padding:20px;}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Yeni Başvuru</title>
</head>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<body>
<div class="header">
  <h1 style="font-family:Lucida Sans Unicode">Bayilik Ön Başvuru Formu</h1>
</div>
    <div class="content" align="center">
        <form:form action="saveForm" method="post" modelAttribute="form">
        <table style="font-family:Lucida Sans Unicode;font-size:20px">          
            <tr>                
                <td><form:input name="ad" type="text" placeholder="Adınız Soyadınız" path="adSoyad" minlength="6" required="required"/></td>
            </tr>
            <tr>
                <td><form:input type="number" placeholder="TC Kimlik Numaranız" minlenght="11" maxlength="11" path="tc" required="required"/></td>
            </tr>
            <tr>
                <td><form:input type="text" placeholder="Adresiz" path="adres" mimlength="20" required="required"/></td>
            </tr>
            <tr>
                <td><form:input type="tel" placeholder="Telefon Numaranız (555)-(555)-(5555)" minlenght="9" maxlength="11" path="telefon" required="required"/></td>
            </tr>
			<tr>
                <td><form:input type="email" placeholder="Mail Adresiniz" path="mail" minlength="4" required="required"/></td>
            </tr>
            <tr>
                <td><form:input type="date" placeholder="Doğum Tarihiniz" path="dogumTarihi" required="required"/></td>
            </tr>
            <tr>
                <td style="color:white">Daha önce Perakende Ticareti ile uğraştınız mı?</td>
            </tr>
            <tr><td></td></tr><tr><td></td></tr>
            <tr >    
                <td style="color:white">Evet<form:radiobutton value="Evet"  path="soru1" required="required"/>  Hayır<form:radiobutton value="Hayır"  path="soru1" required="required"/></td>
            </tr>
            <tr><td></td></tr><tr><td></td></tr><tr><td></td></tr><tr><td></td></tr>            
            <tr>
            	<td><form:input type="number" placeholder="Yatırım miktarınız nedir?" path="soru4" required="required"/></td>
            </tr>                  
            <tr>
                <td></td>                
            </tr>
            <tr>
            	<td><form:textarea rows="3" cols="60" type="text" placeholder="Lokumcu Baba’yı tercih etmenizin sebebi nedir?"  path="soru2" required="required"/></td>
            </tr>
            <tr>
            	<td><form:textarea rows="3" cols="60" type="text" placeholder="Hangi İl/İlçe/Semt için Lokumcu Baba İşletmesi düşünüyorsunuz?" path="soru3" required="required"/></td>
            </tr>
            <tr>
            	<td><form:textarea rows="3" cols="60" type="text" placeholder="Eklemek istedikleriniz nelerdir?" path="soru5" required="required"/></td>
            </tr>
            <tr>
            	               
            </tr>
        </table>
        		<button class="button button1">Formu Gönder</button> 
        </form:form>
    </div>
</body>
</html>