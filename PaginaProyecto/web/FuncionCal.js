function suma() {
  var  cajaTexto1 = parseInt(document.getElementById('cajaTexto1').value);
  var  cajaTexto2 = parseInt(document.getElementById('cajaTexto2').value);
  var    cajaTexto3 =0;
   
   
    cajaTexto3= cajaTexto1+cajaTexto2;

    cajaTexto3 = document.getElementById('cajaTexto3').value = cajaTexto3;
    return false;
}
function resta() {
  var  cajaTexto1 = parseInt(document.getElementById('cajaTexto1').value);
  var  cajaTexto2 = parseInt(document.getElementById('cajaTexto2').value);
  var    cajaTexto3 =0;
   
   
    cajaTexto3= cajaTexto1-cajaTexto2;

    cajaTexto3 = document.getElementById('cajaTexto3').value = cajaTexto3;
    return false;
}
function division() {
  var  cajaTexto1 = parseInt(document.getElementById('cajaTexto1').value);
  var  cajaTexto2 = parseInt(document.getElementById('cajaTexto2').value);
  var    cajaTexto3 =0;
   
   
    cajaTexto3= cajaTexto1/cajaTexto2;

    cajaTexto3 = document.getElementById('cajaTexto3').value = cajaTexto3;
    return false;
}
function multiplicacion() {
  var  cajaTexto1 = parseInt(document.getElementById('cajaTexto1').value);
  var  cajaTexto2 = parseInt(document.getElementById('cajaTexto2').value);
  var    cajaTexto3 =0;
   
   
    cajaTexto3= cajaTexto1*cajaTexto2;

    cajaTexto3 = document.getElementById('cajaTexto3').value = cajaTexto3;
    return false;
}
