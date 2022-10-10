
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE HTML>
<!-- Website template by freewebsitetemplates.com -->
<html>
<head >
	<meta charset="UTF-8">
	<title > Ktun Ai-Lab</title>
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
	
	
			<a href="takimlar" class="more">GERI</a>
	<div class="featured">

				
					<div class="frame1">
						<div class="box">
							<img src="images/saglik.jpg" alt="Img" height="130" width="197">
						</div>
					</div>
					<h2>${team.name }</h2>
					<p class="clearfix">
						<b>Takim kategorisi:</b><br>${team.department}<br>
						<b>Takim bilgisi:</b><br>${team.info}<br>
						<b>Takim kaptani:</b> 
						${team.captain.first_name}<br>
						${team.captain.last_name}<br>
						${team.captain.department}<br>
						${team.captain.email}<br><br>
						
						<b>Takim uyeleri</b>
						<div class="featured">
							<ul class="clearfix">
							<c:forEach var="students" items="${team.students }">
								
								
										<li class="clearfix">
												<p >
												${students.first_name} ${students.last_name}<br>
												${students.department}
											</p>
										</li>
									
								
							</c:forEach>
							</ul>
						</div>			
		</div>
						
						<%-- <c:forEach var="students" items="${team.students }">
							<b>${students.first_name} </b>
							
							
						</c:forEach> 
						  --%>
				
		</div>
	</div>
	<div id="footer">
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
					
					
					</p>
				</div>
				<p>
					© 2022 Ktun Ai-Lab. All Rights Reserved.
				</p>
			</div>
		</div>
	</div>
</body>
</html>