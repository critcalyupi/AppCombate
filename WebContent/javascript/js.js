function entrarJuego(){
    document.getElementById("entry_window").style.display = "none";
    $(document.body).css("background-image",'url("imagenes/main_bg.jpg")');
    document.getElementById("main_window").style.display = "block";
}
function salirJuego(){
    $(document.body).css("background-image",'url("imagenes/entry_bg.jpg")');
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
$(document).ready(function(){
    $(".etiqueta").click(function(){
        $(this).css({"display":"none"});
    });

    $(".etiqueta").mouseover(function(){
        $(this).width(45);
        $(this).css({"clip-path":"polygon(100% 0, 78% 50%, 100% 100%, 0 100%, 0 0)"});
    });
    $(".etiqueta").mouseleave(function(){
        $(this).width(30);
        $(this).css({"clip-path":"polygon(100% 0, 68% 50%, 100% 100%, 0 100%, 0 0)"});
    });
});
