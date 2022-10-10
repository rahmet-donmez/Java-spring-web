
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE HTML>
<!-- Website template by freewebsitetemplates.com -->
<html>
<head >
	<meta charset="UTF-8">
	<title > Ktun Ai-Lab</title>
	<link rel="stylesheet" href="css/style.css" type="text/css">
	 <style type="text/css">
           
            #kayitFormu{
                
                border-radius:10px;
                background-color:blue;
                width:360px;
                margin:auto;
                margin-top:20px;
                padding:15px;
                text-align:center;
            }
            input, button
            {
                border-radius:5px;
                border:none;
                width:300px;
                height:50px;
                margin:20px 0px 20px 0px;
                background:white;
                padding-left:15px;
                font-style:italic;
                
            }
            
            .btn{
                background:blue;
                color:white;
            }
            h3{
                color:#333;
                text-transform:uppercase;
                font-size:20px;
            }
            
        </style>
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
		
		 <div id="kayitFormu">
            <form action="duyuru_guncelle"  name="bulletin">
                <h3>Duyuru Guncelleme Formu</h3>
                Baslik:<input type="text" name="head"  value="${bulletin.head }" /> 
                İcerik:<input type="text" name="texts"  value="${bulletin.texts }"  /> 
                         
                <input class="btn" type="submit" value="guncelle" />
            </form>
            
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
					ÃÂ© 2022 Ktun Ai-Lab. All Rights Reserved.
				</p>
			</div>
		</div>
	</div>
</body>
</html>
