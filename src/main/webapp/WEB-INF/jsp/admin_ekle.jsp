<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html>
    <head>
        <title>Kullanıcı Kayıt Formu</title>
        <meta charset="utf-8" />
        <style type="text/css">
            body{
                background:#76b852;
                font-size:10px;
                font-family:Trebuchet MS;
            }
            #kayitFormu{
                
                border-radius:10px;
                background:#ffffff;
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
                background:rgba(240,240,240,.5);
                padding-left:15px;
                font-style:italic;
                
            }
            
            .btn{
                background:#76b852;
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
        <div id="kayitFormu">
            <form action="admin_kaydet"  name="admin">
                <h3>Admin Kayıt Formu</h3>
                <input type="text" name="first_name" placeholder="ad" /> 
                <input type="text" name="last_name" placeholder="soyad"  /> 
                <input type="email" name="email" placeholder="email" required />
                          
                <input class="btn" type="submit" value="EKLE" />
            </form>
            
        </div>
    
    
    </body>
</html>