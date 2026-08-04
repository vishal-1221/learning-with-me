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
                    <title>Dhriti's Little Farm</title>
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
                            color:#4CAF50;
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

                    <h1>🌻 Dhriti and Her Little Farm 🌻</h1>

                    <img src="/images/Dhriti.jpg"
                         alt="Little Girl on a Farm">

                    <p>
                        In a peaceful little village lived a kind and cheerful girl named
                        <b>Dhriti</b>. Every morning, before the sun rose high in the sky,
                        she happily woke up to take care of her beautiful little farm.
                    </p>

                    <p>
                        Dhriti had two very special friends—a gentle white
                        <b>cow named Gauri</b> and a playful little
                        <b>goat named asha</b>. They loved spending every day together.
                    </p>

                    <p>
                        As the birds sang sweet songs, Dhriti filled a bucket with fresh water
                        and gave Gauri soft green grass to eat. She gently patted Gauri's head,
                        and Gauri happily mooed in return.
                    </p>

                    <blockquote>
                        "Good morning, Gauri! Let's have another wonderful day together."
                    </blockquote>

                    <p>
                        Next, Dhriti ran to asha, who loved jumping around the farm.
                        She gave asha fresh leaves and laughed as the little goat happily
                        followed her everywhere she went.
                    </p>

                    <h2>🌼 A Busy Day on the Farm</h2>

                    <p>
                        Dhriti watered the colorful flowers, picked fresh vegetables from the
                        garden, and planted tiny seeds that would soon grow into healthy plants.
                        Butterflies fluttered around her while birds chirped happily in the trees.
                    </p>

                    <p>
                        After finishing her work, she sat under a big shady tree with Gauri
                        and asha. They enjoyed the cool breeze together while watching fluffy
                        white clouds float across the blue sky.
                    </p>

                    <p>
                        One afternoon, Dhriti noticed that Asha had wandered too close to a
                        small muddy pond. She gently carried the little goat back to safety and
                        cleaned its tiny feet. Asha happily wagged its tail and stayed close to
                        Dhriti for the rest of the day.
                    </p>

                    <blockquote>
                        "Taking care of animals means loving them every single day."
                    </blockquote>

                    <h2>🌈 A Happy Evening</h2>

                    <p>
                        As the sun slowly set behind the hills, Dhriti made sure Gauri had
                        fresh hay and asha had plenty of food and water before they all rested
                        for the night.
                    </p>

                    <p>
                        Looking at her little farm filled with flowers, vegetables, and happy
                        animals, Dhriti smiled with joy. She knew that kindness and hard work
                        made every day beautiful.
                    </p>

                    <h2>❤️ The Moral</h2>

                    <p style="font-size:20px;">
                        When we care for animals with love, work hard, and treat nature with
                        kindness, our hearts become as beautiful as the world around us.
                    </p>

                </div>

                </body>
                </html>
                """;
    }

}
