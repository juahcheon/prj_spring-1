$(function(){
    // setting
    // setting
    // setting
    // setting
    $(".section_projects").hide("slow")
    $(".section_contact").hide("slow")
  
    $(".btn_projects").on("click",function(){

        // $(".section_contact").fadeOut(function(){
        //     $(".section_projects").fadeIn();
        //     console.log("project is currently");
        //     console.log($(".section_projects").is(":visible"));
        //     console.log("contact is currently");
        //     console.log($(".section_contact").is(":visible"));
        // });

        // if($(".section_projects").is(":visible") || $(".section_contact").is(":visible")){
        //     $(this).fadeOut(function(){
        //         console.log("this works");
        //         $(".section_projects").fadeIn();
        //     });
        // }
        $(".main_container").children("div").each(function(index,item){
            if($(item).is(":visible")){
                $(this).fadeOut(function(){
                    $(".section_projects").fadeIn();
                });
            }
        });


    });
    $(".btn_contact").on("click",function(){
        // $(".section_projects").fadeOut(function(){
        //     $(".section_contact").fadeIn();
        //     console.log("contact is currently");
        //     console.log($(".section_contact").is(":visible"));
        //     console.log("project is currently");
        //     console.log($(".section_projects").is(":visible"));
        // });

        $(".main_container").children("div").each(function(index,item){
            if($(item).is(":visible")){
                $(this).fadeOut(function(){
                    $(".section_contact").fadeIn();
                });
            }
        });


        // if($(".section_projects").is(":visible") || $(".section_contact").is(":visible")){
        //     $(this).fadeOut(function(){
        //         console.log("this works right");

        //         $(".section_contact").fadeIn();
        //     });
        // }
    });

    $(".btn_home").on("click",function(){
        $(".main_container").children("div").each(function(index,item){
            if($(item).is(":visible")){
                $(this).fadeOut(function(){
                    $(".section_index").fadeIn();
                });
            }
        });
    });
});