<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title> yêu cầu 2</title>
</head>
<body>
      <script>
          let old="35";
          let name="Chánh";
          let cmnd= "0000000";
          let birthday=" 30/2/1980";
          let email="chanhtv@gmail.com";
          let address="chưa rõ";
          let typeService="dom";
          let typeRoom="single";
          let typeCustomer="silver";
          let discount=2;
          let quantityInclued=20;
          let rendDays= 15;
          let totalPay;
          let choose= parseInt(prompt("1.hiễn thị thông tin khách hàng "+"\n" +
          " 2.chỉnh sữa thông tin khách  hàng "+"\n" +
          " 3.hiễn thị  giá sau khi giảm giá" ));
          switch(choose) {
              case 1 : {
                  alert("Tên:" + name + "\n" +
                      "Cmnd:" + cmnd +
                      "Ngày sinh" + birthday + "\n" +
                      "địa chỉ email:" + email + "\n" +
                      "Địa chỉ:" + address + "\n" +
                      "loại dịch dụ:" + typeService + "\n" +
                      "loại phòng:" + typeRoom + "\n" +
                      "loai khách hàng" + typeCustomer + "\n" +
                      "giảm giá:" + discount + "\n" +
                      "số lượng đi kèm:" + quantityInclued + "\n" +
                      "ngày thuê:" + rendDays);
                  break;
              }
              case 2: {
                  let chooseedit = parseInt(prompt(
                      "1.Tên:" + name + "\n" +
                      "2.Cmnd:" + cmnd +
                      "3.Ngày sinh" + birthday + "\n" +
                      "4.địa chỉ email:" + email + "\n" +
                      "5.Địa chỉ:" + address + "\n" +
                      "6.loại dịch dụ:" + typeService + "\n" +
                      "7.loại phòng:" + typeRoom + "\n" +
                      "8.loai khách hàng" + typeCustomer + "\n" +
                      "9.giảm giá:" + discount + "\n" +
                      "10.số lượng đi kèm:" + quantityInclued + "\n" +
                      " 11.ngày thuê:" + rendDays));
                  switch (chooseedit) {
                      case 1 : {
                          name = prompt("nhập tên cần sữa");
                          break;
                      }
                      case 2 : {
                          cmnd = prompt("nhập cmnd cần sữa");
                          break;
                      }
                      case 3 : {
                          birthday = prompt("nhập ngày sinh cần sữa");
                          break;
                      }
                      case 4 : {
                          email = prompt("nhập email cần sữa");
                          break;
                      }
                      case 6 : {
                          typeService = prompt("nhập loại dịch vụ cần sữa");
                          break;
                      }
                      case 7 : {
                          typeRoom = prompt("nhập loại phòng cần sữa");
                          break;
                      }
                      case 8: {
                          typeCustomer = prompt("nhập loại khách cần sữa");
                          break;
                      }
                      case 9: {
                          discount = prompt("nhập giảm giá cần sữa");
                          break;
                      }
                      case 10: {
                          quantityInclued = prompt("nhập sô lượng đi kèm cần sữa");
                          break;
                      }
                      case 11: {
                          rendDays = prompt("nhập ngày thuê cần sữa");
                          break;
                      }
                      default:
                          alert("failed");
                  }
                  alert("1.Tên:" + name + "\n" +
                      "2.Cmnd:" + cmnd +
                      "3.Ngày sinh" + birthday + "\n" +
                      "4.địa chỉ email:" + email + "\n" +
                      "5.Địa chỉ:" + address + "\n" +
                      "6.loại dịch dụ:" + typeService + "\n" +
                      "7.loại phòng:" + typeRoom + "\n" +
                      "8.loai khách hàng" + typeCustomer + "\n" +
                      "9.giảm giá:" + discount + "\n" +
                      "10.số lượng đi kèm:" + quantityInclued + "\n" +
                      " 11.ngày thuê:" + rendDays)
              }
              case 3: {
                  let money = 0;
                  if (typeService === "Villa") {
                      money = 500
                  } else if (typeService === "House") {
                      money = 300
                  } else if (typeService === "Room") {
                      money = 100
                  }
                  let temp=0;
                  if(address==="Đà Năng"){
                      temp+=20
                  }else if(address==="Huế"){
                      temp+=10
                  }else if( address==="Quảng Nam"){
                      temp+=5
                  }
                  if(rendDays>7){
                      temp+=30
                  }else if(rendDays>5){
                      tem+=20
                  }else if(rendDays>2)
                      temp+=10;
                  if(typeCustomer==="Diamond"){
                      temp+=15
                  }else if(typeCustomer==="Planium"){
                      temp+=10
                  }else if(typeCustomer==="Gold"){
                      temp+=5
                  }else if(typeCustomer==="silver"){
                      temp+=2
                  }else if(typeCustomer==="Menber"){
                      temp+=0
                  }
                  if( old>30 && address==="Quảng Trị"){
                      temp+=2
                  }else if( old>20 && address ==="Quảng Trị"){
                      temp+=1
                  }
                  totalPay=money*rendDays-temp;
                  alert("total pay:" +totalPay);
              }

          }
      </script>
</body>
</html>
