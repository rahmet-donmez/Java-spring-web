    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" import="java.util.List" %>

<!DOCTYPE HTML>
<!-- Website template by freewebsitetemplates.com -->
<html>
<head>
	<meta charset="UTF-8">
	<title>Ktun Ai-Lab</title>
	<link rel="stylesheet" href="css/style.css" type="text/css">
</head>
<body>
	<div id="header">
		<div class="clearfix">
			<div class="logo">
				<a href="ana_sayfa"><img src="images/logo1.jpg" alt="LOGO" height="110" width="110"></a>
			</div>
			<b >Konya Teknik Universitesi Yapay Zeka ve Veri Bilimi Laboratuvari</b>
			<ul class="navigation">
				<li class="active">
					<a href="ana_sayfa">Ana sayfa</a>
				</li>
				<li>
					<a href="hakkimizda">Hakkimizda</a>
				</li>
				<li>
					<a href="duyurular">Duyurular</a>
				</li>
				<li>
					<a href="takimlar">Takimlar</a>
				</li>
				<li>
					<a href="iletisim">Iletisim</a>
				</li>
				<li >
					Yonetici Islemleri
					<ul>
					
						<li><a href="duyuru_islemleri">duyuru islemleri</a></li>
						<li><a href="takim_islemleri">takim islemleri</a></li>
						
						
					</ul>
				</li>
			</ul>
		</div>
	</div>
	<div id="contents">
		
		<div class="featured">
	
	

			<h2>TAKIMLAR</h2>
			<ul class="clearfix">
			<c:forEach var="teams" items="${teams}">
			
				<li>
					<div class="frame1">
						<div class="box">
							<img src="images/saglik.jpg" alt="Img" height="130" width="197">
						</div>
					</div>
					<p>
						<b>Takim adi</b> ${teams.name }
					</p>
					<a href="takim_detay_islem?id=${teams.id }" class="more">Islem yap</a>
					
				</li>
					
			</c:forEach>
			<li>
					<div class="frame1">
						
					<div class="box">
												<a href="yeni_takim" class="more" >takim ekle</a>
							
							<a href="yeni_takim"><img src="images/ekle.jpg" alt="Img" height="130" width="197"></a>
						</div>
					
					</div>
				</li>
			</ul>
		</div>
	</div>
	
		<div id="footnote">
			<div class="clearfix">
					<div class="connect">					
					<p>
					<a href="https://instagram.com/ktunailab" class="instagram" ></a>
					<a href="https://linkedin.com/ktunailab" class="linkedin" ></a>
					<a href="https://twitter.com/ktunailab" class="twitter" ></a>
					 </p>
				</div>
				<div class="connect">
					<p class="concat" >
						<p class="concat" >adres:Konya Teknik Universitesi <br>email:ktun@ailab.tr</p>
					
					
				</div>
				
				<p>
					© 2022 Ktun Ai-Lab. All Rights Reserved.
				</p>
			</div>
		</div>
</body>
</html>