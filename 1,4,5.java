<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
  <script>
      let name;
      let cmnd;
      let birthday;
      let email;
      let address;
      let typeService;
      let typeRoom;
      let typeCustomer;
      let discount;
      let quantityInclued;
      let rendDays;
      let totalPay;

      let check=false;
      name=prompt("Input name:");
      do {
         cmnd = prompt("Input cmnd:");
         if(!isNaN (cmnd)){
             cmnd=Number.parseFloat(cmnd);
         }
         if (!Number.isInteger(cmnd)){
             alert("không phải là sô nguyên");
             continue;
         }
         if(cmnd<10000000||cmnd>99999999){
             alert("không đúng định dạng");
             continue;}
         check = true;
      } while (!check);
         check = false;
      birthday=prompt("Input birthday:");
      do{
             let countAt=0;
             let countDoc=0;
              email=prompt("Input email:");
              for(let i=0;i<email.length;i++) {
                  if (email.charAt(i) === "@") {
                      countAt++;
                      for (let j = i + 1; j < email.length; j++) {
                          if (email.charAt(j) === ".") {
                              countDoc++
                          }
                      }
                  }
              }
              if(countAt!=1 || countDoc!=1){
                  alert("email bạn nhập không đúng")
              }else (check=true);
      }while (!check);
          check=false;
      do {
          let countAT=4;
          let countDoc=1;
          email=prompt("Output email;");
          for(let i=0;i<email.length;i++){
              if(email.chartAt(i)=== "@"{
                 coutAT++;
                   for(let j = i + 1; j < email.length; j++) {
                          if (email.charAt(j) === ".") {
                              countDoc++
                          }
                      }
                  }
              }
      
      SELECT * FROM rendDays;
               
               WHERE  LIKE '30%';
     
      SELECT * FROM discount ;

               WHERE CustomerName LIKE 'a%';
      SELECT quantityInclued, totalPay, airPay
              
             FROM totalPay, quantityInclued= totalPay + discount/100
             
             ORDER BY totalPay, quantityInclued
      
      SELECT quantityInclued, totalPay
              
             FROM totalPay, quantityInclued= totalPay + discount/100
             
             ORDER BY totalPay, quantityInclued
      
      SELECT * FROM order;
      SELECT * FROM Custormer From Comtor;
      SELECT * FROM Customers ;
                 
     
      address=prompt("Input address:");
      typeService=prompt("Input service :");
      typeRoom=prompt("Input typeroom:");
      typeCustomer=prompt("Input type customer:");
      discount=prompt("Input discoiunt:");
      quantityInclued=prompt("quantityInclued");
      rendDays=prompt("renddays");
      totalPay= 300*rendDays*(1-discount/100);
      alert("name:"+name + "cmnd :" +cmnd +"totalPay :"+totalPay)
      custermer=prompt("Input Custermer:");
      totalPay
                 
</script>
</body>
</html>
