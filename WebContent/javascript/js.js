function entrarJuego(){
	$(document.body).css("background-image",'url("imagenes/main_bg.jpg")');
    $("#entry_window").hide();
    $("#main_window").show();
}
function salirJuego(){
    $(document.body).css("background-image",'url("imagenes/entry_bg.jpg")');
    $("#entry_window").show();
    $("#main_window").hide();
}

$(document).ready(function(){
    $(".ventana").each(function(){// inician invisibles
        $(this).hide();
    });
    $(".etiqueta").click(function(){
        var $id = $(this).attr('id');
        var $idFicha = $id.split('_',4)[1];
        $("[id^='win_'][id$="+$idFicha+"]").each(function(){
            $(this).hide();
        });

        if ($(this).hasClass("activated")){
            $(this).removeClass("activated");
        } else {
            $("[id$='_"+$idFicha+"_etq'").each(function(){
                $(this).show();
                $(this).removeClass("activated active");
            });
            //$(this).css({"display":"none"});
            $(this).addClass("activated active");

            $id = $id.split("_");
            $id = $id[0]+"_"+$id[1];
            $("#win_"+$id).show();
            //posicion
            var $pos = $("#ficha_"+$idFicha).position();
            $("#win_"+$id).css({"left":($pos.left+17)+"px"});
            $("#win_"+$id).css({"top":($pos.top+17)+"px"});
            //posicion de las etiquetas
            /*$("[id$='_"+$idFicha+"_etq'").each(function(){
                
            });*/
        }
    });

    $(".etiqueta").mouseover(function(){
        if (!$(this).hasClass("activated")){
            $(this).addClass("active");
        }
    });
    $(".etiqueta").mouseleave(function(){
        if (!$(this).hasClass("activated")){
            $(this).removeClass("active");
        }
    });
});
