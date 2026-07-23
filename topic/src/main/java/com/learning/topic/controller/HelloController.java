package com.learning.topic.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topic/v1")
public class HelloController {

    @GetMapping(value = "/story", produces = MediaType.TEXT_HTML_VALUE)
    public String getStory() {

        return """
    <!DOCTYPE html>
    <html>
    <head>
        <title>Dhriti Porter's Adventure</title>
        <style>
            body{
                font-family: Arial, sans-serif;
                background:#f4f8ff;
                margin:40px;
                line-height:1.8;
            }
            .card{
                max-width:900px;
                margin:auto;
                background:white;
                padding:30px;
                border-radius:15px;
                box-shadow:0 5px 15px rgba(0,0,0,.2);
            }
            h1{
                color:#ff4081;
                text-align:center;
            }
            h2{
                color:#2196F3;
            }
            img{
                width:100%;
                border-radius:15px;
            }
            p{
                font-size:18px;
            }
        </style>
    </head>

    <body>

    <div class="card">

        <h1>🌸 The Magical Adventure of Little Dhriti Porter 🌸</h1>

        <img src="/images/13864.jpg"
             alt="Happy Family">

        <p>
        In a cozy little town lived a cheerful little girl named
        <b>Dhriti Porter</b>. She had sparkling eyes, a bright smile,
        and endless curiosity.
        </p>

        <p>
        Her loving mother <b>Nayan</b> always encouraged her to dream big.
        Every morning she would say,
        </p>

        <blockquote>
        "Good morning, my little sunshine! Today is another beautiful day to learn something new."
        </blockquote>

        <p>
        Dhriti would happily run into the kitchen,
        give her mother a warm hug,
        and help set the breakfast table.
        </p>

        <p>
        Her father <b>Harsh</b> loved telling bedtime stories.
        Every evening after work,
        he would lift Dhriti into the air,
        making her laugh louder than the birds outside.
        </p>

        <blockquote>
        "One day," Harsh smiled,
        "you will become someone who spreads kindness everywhere."
        </blockquote>

        <h2>🌈 A Special Day</h2>

        <p>
        One Sunday the family decided to visit a beautiful park.
        They played football,
        flew colorful kites,
        fed tiny ducks,
        and enjoyed delicious ice cream together.
        </p>

        <p>
        While walking home,
        Dhriti noticed a small lost puppy.
        She gently offered it some water and stayed beside it until its owner arrived.
        </p>

        <p>
        Nayan smiled proudly and said,
        </p>

        <blockquote>
        "Kindness is the greatest superpower anyone can have."
        </blockquote>

        <p>
        Harsh nodded and added,
        </p>
        
      

        <blockquote>
        "And today, our little Dhriti proved she has that superpower."
        </blockquote>
        
          <p>
        A special thanks to your wonderful Maasi, whose love, care, and blessings have always been a beautiful part of your life. Wishing her happiness and good health too
        </p>

        <h2>❤️ The Moral</h2>

        <p style="font-size:20px;">
        Family is where love begins,
        kindness grows,
        and every little adventure becomes a lifelong memory.
        </p>

    </div>

    </body>
    </html>
    """;
    }

}
