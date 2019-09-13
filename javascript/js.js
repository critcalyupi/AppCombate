function entrarJuego(){
    document.getElementById("entry_window").style.display = "none";
    $(document.body).css("background-image",'url("/web_de_combate/imagenes/fondo1.jpg")');
    document.getElementById("main_window").style.display = "block";
}
function salirJuego(){
    document.getElementById("entry_window").style.display = "block";
    document.getElementById("main_window").style.display = "none";
}
/*
$(document).ready(function(){
    var x;
    for (var i=1; i<=12; i++){
        x = $("#ficha_"+i).offset();
        $('.ficha_'+i).text("numero "+i+" "+x.top+" "+x.left);
    }
});*/