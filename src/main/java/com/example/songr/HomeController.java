package com.example.songr;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Controller
public class HomeController {

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        return "hello world";
    }


    @RequestMapping(value = "/capitalize/{text}")
    public String capitalize(@PathVariable String text ,Model model){
        model.addAttribute("text", text.toUpperCase(Locale.ROOT));
        return "capitalize";
    }

    @RequestMapping(value = "/albums")
    @ResponseBody
    public List<Album> albums(){
        List<Album> albums = new ArrayList<>();
        albums.add(new Album("https://m.media-amazon.com/images/M/MV5BY2U4MGI0MWUtODE0MS00YjliLWI3MmQtYTZhYWEwYWFmMTMyXkEyXkFqcGdeQXVyNDQ5MDYzMTk@._V1_.jpg","natural","imagine dragons",10,10));
        albums.add(new Album("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTNNlwTFa2QwDve1nOIaPnm8g_hAXs9igWRh-NNO0FD9yQx08F4QY369mpo4A0UseGKgA0&usqp=CAU","cheap thrill","sia",10,10));
        albums.add(new Album("https://i.ytimg.com/vi/ZWKpPDI1M-o/sddefault.jpg","begging you","maneskin",10,10));

        return albums;
    }



}
