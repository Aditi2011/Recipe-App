package com.example.bonappetite;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class ViewRecipeActivity extends AppCompatActivity {
    private String[][] ve =
            {
                    {"Veg Cheese Balls", "", "", "", "Click to view Details"},
                    {"Grilled Sandwich", "", "", "", "Click to view Details"},
                    {"French Fries", "", "", "", "Click to view Details"},
                    {"Creamy Pasta Salad", "", "", "", "Click to view Details"},
                    {"Masala Dosa", "", "", "", "Click to view Details"},
            };
    private String[][] nv =
            {
                    {"Chicken65", "", "", "", "Click to view Details"},
                    {"Ham Cheese Burger", "", "", "", "Click to view Details"},
                    {"Chilli Garlic Prawns", "", "", "", "Click to view Details"},
                    {"Egg Toast", "", "", "", "Click to view Details"},
                    {"Chicken Cheese Pizza", "", "", "", "Click to view Details"},
            };
    private String[][] ind =
            {
                    {"Chicken Tandoori", "", "", "", "Click to view Details"},
                    {"Butter Chicken", "", "", "", "Click to view Details"},
                    {"Pav Bhaji", "", "", "", "Click to view Details"},
                    {"Samosa", "", "", "", "Click to view Details"},
                    {"Pani Puri", "", "", "", "Click to view Details"},
            };
    private String[][] ita =
            {
                    {"Pizza", "", "", "", "Click to view Details"},
                    {"Spaghetti Meatballs", "", "", "", "Click to view Details"},
                    {"Authentic Italian Gravy", "", "", "", "Click to view Details"},
                    {"Gourmet Italian Grilled Cheese with Pesto", "", "", "", "Click to view Details"},
                    {"Crispy Salmon Tacos", "", "", "", "Click to view Details"},
            };
    private String[][] chi =
            {
                    {"Classic Beef Fried Rice", "", "", "", "Click to view Details"},
                    {"Garlic Chicken", "", "", "", "Click to view Details"},
                    {"Vegetables in Hot Garlic Sauce", "", "", "", "Click to view Details"},
                    {"Chicken Chow Mein", "", "", "", "Click to view Details"},
                    {"Schezwan Paneer Momos", "", "", "", "Click to view Details"},
            };
    private String[][] des =
            {
                    {"Gulab Jamun", "", "", "", "Click to view Details"},
                    {"Choco Lava Cake", "", "", "", "Click to view Details"},
                    {"Tiramisu", "", "", "", "Click to view Details"},
                    {"Mocha Frappuccino", "", "", "", "Click to view Details"},
                    {"Chocolate Chip Cookie Bars", "", "", "", "Click to view Details"},
            };
    TextView tv;
    String[][] book_details = {};
    String[] books;
    ArrayList list;
    SimpleAdapter sa;
    HashMap<String, String> item;

    private int[] v_img={R.drawable.cheeseball,R.drawable.sandwich,R.drawable.fries,R.drawable.salad,R.drawable.dosa};
    private int[] nv_img={R.drawable.chicken65,R.drawable.burger,R.drawable.prawn,R.drawable.egg,R.drawable.pizza};
    private int[] ind_img={R.drawable.tandoori,R.drawable.bchick,R.drawable.pavbhaji,R.drawable.samosa,R.drawable.panipuri};
    private int[] ita_img={R.drawable.pizza,R.drawable.spaghetti,R.drawable.gravy,R.drawable.gourmet,R.drawable.taco};
    private int[] chi_img={R.drawable.friedrice,R.drawable.ginger,R.drawable.soup,R.drawable.chowmein,R.drawable.momo};
    private int[] des_img={R.drawable.gulabjamun,R.drawable.lava,R.drawable.tiramisu,R.drawable.frappucino,R.drawable.cookie};
    private int[] images={};
    private String[] ve_det = {
            "Ingredients:\n" +
                    "-100 grams potatoes or 3 small or 2 medium or 1 large potato\n" +
                    "-60 grams processed cheese or cheddar cheese or ½ cup grated cheese tightly packed\n" +
                    "-¼ teaspoon black pepper crushed or ⅓ teaspoon black pepper powder - add as required\n" +
                    "-½ teaspoon cumin powder (ground cumin)\n" +
                    "-1 pinch Garam Masala - optional\n" +
                    "-2 tablespoons chopped coriander leaves (cilantro) or parsley leaves\n" +
                    "-4 tablespoon gram flour (besan) or chickpea flour or 2 to 3 tablespoon arrow root flour or corn starch or all purpose flour\n" +
                    "-2 to 3 pinches black salt or regular salt or rock salt\n" +
                    "- Oil for deep frying, as required\n" +
                    "\n" +

                    "Instructions:\n" +
                    "•Boil potatoes in a steamer or pressure cooker or an electric cooker. Boil the potatoes till they are completely cooked. You can even steam the potatoes in an Instant Pot for 7 to 8 minutes.\n" +
                    "\n" +
                    "•When the potatoes become warm, peel them and mash very well in a mixing bowl. Allow the potatoes to come at room temperature before you add the remaining ingredients.\n" + "\n" +
                    "•Grate 60 grams cheese and keep aside. In cup measurement, the amount is ½ cup tightly packed grated cheese. \n" +"\n" +
                    "•You can use either cheddar cheese or processed cheese. If using amul processed cheese, then use 3 cubes.\n" +"\n" +
                    "•Making cheese ball mixture\n" + "\n" +
                    "•To the mashed potatoes, add black pepper, crushed or black pepper powder, cumin powder, a pinch of garam masala (optional) and chopped coriander leaves or parsley leaves.\n" +"\n" +
                    "•Add gram flour (besan). You can also add all purpose flour or cornstarch (corn flour).\n" +"\n" +
                    "•Mix very well.\n" + "\n" +
                    "•Then add the grated cheese and two pinches of black salt. Add salt accordingly as cheese already has salt. You can even add rock salt or regular salt instead of black salt.\n" +"\n" +
                    "•Mix the cheese with the rest of the potato mixture very well. Check the taste and add more salt or crushed black pepper if required.\n" +"\n"+
                    "•Make small balls from the mixture and make one tiny ball to test while frying.\n" +"\n" +
                    "•Frying cheese balls\n" +"\n" +
                    "•Heat oil for deep frying in a kadai or pan.\n" +"\n" +
                    "•When the oil becomes hot, add the tiny cheese ball. The temperature of oil can be from 180 to 190 degrees celsius.\n" +"\n" +
                    "•The oil has to be hot, otherwise the cheese balls may break.\n" +"\n" +
                    "•When the tiny cheese ball, does not break, then you can easily fry the other balls. If it breaks, then you have to add 1 to 2 tablespoons gram flour or chickpea flour to the mixture again. Keep the same temperature while frying by increasing or decreasing the heat.\n" +"\n" +
                    "•Add the remaining potato cheese balls.\n" +"\n" +
                    "•With a slotted spoon, turn over when the balls get to become golden.\n" +"\n" +
                    "•Fry them till they are evenly golden all over and crisp.\n" +"\n" +
                    "•Once fried well, place them on kitchen paper towels to remove excess oil\n" +"\n" +
                    "•Serve hot with tomato ketchup or coriander chutney or mint chutney or any dip of your choice. For best taste serve them hot as soon as they are prepared.\n"+"\n",
            "Ingredients:\n" +
                    "-10 slices white bread or brown bread or whole wheat bread or sandwich bread\n" +
                    "-1 potato (medium-sized) - boiled, peeled and sliced into rounds\n" +
                    "-1 beetroot (medium sized) - boiled, peeled and sliced into rounds\n" +
                    "-1 cucumber (small to medium) - thinly sliced\n" +
                    "-1 onion (small) - thinly sliced\n" +
                    "-1 tomato (small to medium) - thinly sliced\n" +
                    "-Butter as required\n" +
                    "-1 teaspoon chaat masala powder or add as required\n" +
                    "-1teaspoon roasted cumin powder or add as required\n" +
                    "-½ teaspoon black salt or regular salt, add as required\n" +
                    "-¼ teaspoon freshly crushed black pepper - optional\n" +
                    "-tomato ketchup - to be served with the sandwich\n" +"\n" +

                    " For coriander chutney\n" +
                    "-1 cup chopped coriander leaves (cilantro)\n" +
                    "-1 to 2 garlic cloves (small to medium sized) - chopped\n" +
                    "-1 teaspoon chopped green chilies or serrano peppers or 1 to 2 green chillies\n" +
                    "-½ to ¾ teaspoon lemon juice or add as required\n" +
                    "-½ teaspoon cumin powder\n" +
                    "-¼ teaspoon black salt - optional\n" +
                    "-salt or rock salt, add as required\n" +
                    "-1 to 2 tablespoons water for grinding chutney - optional\n" +
                    "\n" +
                    "Instructions:\n" +
                    "Making coriander chutney:-\n" +
                    "•In a grinder or blender grind all the above chutney ingredients to a smooth paste using very little water. Set the chutney aside. If there are leftovers, then keep in an airtight container in the refrigerator.\n" +"\n" +
                    "•Preparing veggies\n" +"\n" +
                    "•Boil or steam the potatoes and beets if using them. They should not be cooked too much or fall apart. Just cooked well until softened. Peel and slice them when warm.\n" +"\n" +
                    "•Rinse, peel and slice the onion, tomatoes and cucumber in thin rounds.\n" +"\n" +
                    "•Assembling sandwich\n" +"\n" +
                    "•Butter all the bread slices. The butter has to be spread evenly and generously so that the bread does not become soggy on spreading the chutney. Spread some green chutney on the slices.\n" +"\n" +
                    "•Place a few slices of potatoes and then sprinkle with roasted cumin powder and chaat masala powder.\n" +"\n" +
                    "•Then place 2 to 3 cucumber, tomato, onion and beet slices if using them. Sprinkle roasted cumin powder, chaat masala powder or sandwich masala and black salt.\n" +"\n" +
                    "•Cover the sandwiches with the remaining slices of bread.\n" +"\n" +
                    "•Spread butter on the top of slices.\n" +"\n" +
                    "•Grilling sandwich\n" +"\n" +
                    "•In a preheated grill, place the sandwich carefully with the buttered side facing at the bottom. Be careful when doing this. Now spread butter on the top side facing you.\n" +"\n" +
                    "•Close the grill and grill the sandwiches for 2 to 3 minutes or until crisp and golden.\n" +"\n" +
                    "•Remove the grilled sandwiches with a wooden spatula. In batches grill the next lot.\n" +"\n" +
                    "•Serve the grilled sandwich hot with tomato ketchup and coriander chutney or any other green chutney of your choice\n"+"\n",
            "Ingredients:\n" +
                    "-315 grams potatoes or 3 medium-sized or 2 large - russet, idaho, yukon gold or maris piper\n" +
                    "-3.5 cups cold water\n" +
                    "-oil for deep frying - as required\n" +
                    "-½ teaspoon dried rosemary or dried oregano or mixed herbs - as required\n" +
                    "-½ teaspoon red chili powder or paprika or cayenne pepper as required - optional\n" +
                    "-salt as required, can use black salt or edible rock salt or pink salt\n" +
                    "\n" +
                    "Instructions:\n" +

                    "First Frying\n" +
                    "•Heat oil in a wok or pan over medium-low or medium heat. For a heavy pan, keep medium heat and for a less heavy pan, use a medium-low heat. The oil should have a temperature of 135 degrees Celsius (275 degrees Fahrenheit).\n" +"\n" +
                    "•Now, working in batches, add the potatoes to the oil. Do not overcrowd the wok (kadai) or pan with the potatoes. The oil will sizzle and bubble less when you fry the potatoes at this temperature.\n" +"\n" +
                    "•Stir at intervals while frying them for uniform cooking.\n" +
                    "•Fry/blanch in oil for about 3 minutes or until the potatoes are cooked, but not brown from outside. They should just get a crust from outside without any major color change. Light browning of the edges is fine. Remove with a slotted spoon.\n" +"\n" +
                    "•Place the half fried potatoes on paper kitchen towels. Stack 3 to 4 paper towels. Press some paper towels from top also to absorb extra oil. Let the half fried potatoes cool down at room temperature. \n" +"\n" +
                    "•Note that after removing this batch, you can fry the second batch of potatoes. By the time you fry the second batch of the potatoes, the first batch will cool down. So even though you have to fry twice, you’re using the same batch of oil all the way through.\n" +"\n" +

                    "Second Frying\n" +
                    "•Now increase the heat to a medium-high or high. Again here for a heavy pan, use a high heat and for a less heavy pan, use medium-high heat. The oil should be hot on medium-high to high heat having a temperature of 180 to 185 degrees celsius (356 to 365 degrees Fahrenheit).\n" +"\n" +
                    "•Add the first batch of once-fried potatoes to the hot oil. The oil will sizzle and bubble quickly and as soon as you add the potatoes.\n" +"\n" +
                    "•Stir often while the potatoes fry to cook them evenly. Fry french fries for 3 minutes or until crisp and golden. The edges should become golden. Remove with a slotted spoon.\n" +"\n" +
                    "•Place french fries on paper tissues again to remove the extra oil.\n"+"\n",
            "Ingredients:\n" +
                    "-1 pound dried pasta like fusilli, penne, rotini or farfalle (bow tie)\n" +
                    "-1 cup sliced bell pepper (1 medium)\n" +
                    "-1 cup thinly sliced zucchini (1/2 medium)\n" +
                    "-1 cup halved cherry tomatoes\n" +
                    "-1/3 cup thinly sliced scallions (5 to 6)\n" +
                    "-1/4 cup sliced pepperoncini or banana peppers, optional\n" +
                    "-1 cup (4 ounces) halved mixed olives\n" +
                    "-1 cup (2 ounces) grated parmesan cheese or hard cheese\n" +
                    "-1 cup (6 ounces) fresh mozzarella balls, chopped\n" +
                    "-1/3 cup fresh parsley or basil, optional\n" +"\n" +

                    "HOMEMADE DRESSING\n" +
                    "-1/3 cup red wine vinegar, white wine vinegar or champagne vinegar\n" +
                    "-1/2 teaspoon fine sea salt, plus more to taste\n" +
                    "-1/3 cup red wine vinegar, white wine vinegar or champagne vinegar\n" +
                    "-1/2 teaspoon fresh ground black pepper\n" +
                    "-1/3 cup red wine vinegar, white wine vinegar or champagne vinegar\n" +
                    "-1/2 teaspoon dried oregano\n" +
                    "-2 to 3 tablespoons juice from pepperoncini jar, optional\n" +"\n" +

                    "Instructions:\n" +
                    "•1/3 cup red wine vinegar, white wine vinegar or champagne vinegar\n" +"\n" +
                    "•Bring a large pot of salted water to a boil. Add pasta and cook until tender, 6 to 10 minutes (check the package for recommended cook time). Drain and rinse well under cold water.\n" +"\n" +
                    "•While the pasta cooks, in the bottom of a large bowl, make the dressing. Whisk the red wine vinegar, salt, pepper, oregano, pepperoncini juice (if using), and the olive oil until blended. Add the drained and rinsed pasta to the dressing and mix well.\n" +"\n" +
                    "•Stir in the bell pepper, zucchini, tomatoes, scallions, pepperoncini (if using), olives, parmesan, mozzarella, and the herbs (if using). Taste for seasoning and adjust with salt and pepper as needed. Serve or for the best results, cover and refrigerate at least 30 minutes and up to 5 days.\n",
            "Ingredients:\n" +
                    "-Ingredients for potato filling\n" +
                    "-4 potatoes medium-sized potatoes - 300 grams or 2 cups boiled, chopped or crumbled potatoes\n" +
                    "-2 tablespoons oil - any neutral oil\n" +
                    "-½ teaspoon mustard seeds\n" +
                    "-1.25 cups onions thinly sliced, or 2 medium to large - 150 grams\n" +
                    "-1 teaspoon ginger - finely chopped, or 1 inch peeled ginger\n" +
                    "-8 to 10 curry leaves\n" +
                    "-1 teaspoon green chillies - chopped, or 1 to 2 green chillies\n" +
                    "-¼ teaspoon turmeric powder\n" +
                    "-½ cup water\n" +
                    "-3 tablespoons coriander leaves - chopped\n" +
                    "-salt as required\n" +
                    "\n" +

                    "Instructions:\n" +
                    "•Preparation for potato filling\n" +
                    "•First rinse and then boil 4 medium sized potatoes in 2 cups water for 5 to 6 whistles in a pressure cooker. You can also boil potatoes in a pan or in an Instant pot. The potatoes have to be completely cooked and fork tender.\n" +"\n" +
                    "•When the potaoes are cooking, soak the chana dal in hot water for 30 minutes. Then drain the chana dal and keep aside.\n" +"\n" +
                    "•When the pressure settles down on its own in the cooker, remove the lid. Drain the water from the potatoes and let them become warm. Then peel and chop them.\n" +"\n" +
                    "•Also slice the onions thinly and chop the green chilies, ginger and coriander leaves.\n" +"\n" +
                    "•Making potato filling\n" +"\n" +
                    "•Heat oil or ghee in a frying pan or a skillet. Fry cashews and keep aside. This step of frying cashews is optional.\n" +"\n" +
                    "•Lower the flame and add mustard seeds and let them splutter. Then add the chana dal.\n" +"\n" +
                    "•Add water. Mix well and simmer for 2 to 3 minutes or till the mixture thickens a bit.\n" +"\n" +
                    "•Next add the boiled chopped potatoes and mix very well. You can also mash the potatoes if you like while cooking them.\n" +"\n" +
                    "•Season with salt according to taste. Also add ¼ teaspoon sugar for a slight sweet taste.\n" +"\n" +
                    "•Simmer on a low flame for 3 to 4 minutes stirring occasionally. The water will reduce and the consistency will thicken. \n" +"\n" +
                    "•Switch off the flame and then add chopped coriander leaves. Also add the fried cashews now and mix well. The potato filling should be moist and easily spreadable on the dosa. Make sure there is no water in the potato filling. It should not be of a curry or gravy consistency.\n" +"\n" +
                    "•Stir and keep the potato filling aside.\n" +"\n" +
                    "•Making masala dosa\n" +"\n" +
                    "•Lightly stir the batter, before you begin to make dosa. You will also see tiny air pockets in the batter and it would have increased in volume.\n" +"\n" +
                    "•Heat a cast iron pan or a flat non-stick pan. The pan should be medium hot. Smear some oil if using an iron pan or griddle. Don't smear oil on a non stick pan, as then you won't be able to spread the batter.\n" +"\n" +
                    "•Cover with a lid and let it cook. You can spread the oil which was sprinkled earlier on the dosa with a spoon. Cook till its base becomes golden and crisp.\n" +"\n" +
                    "•When you see the base has become golden and the edges separate from the pan, place a portion of the potato filling on the dosa. You can spread it a bit if you want.\n" +"\n" +
                    "•Now fold the dosa and serve.\n"
    };
    private String[] nv_det = {
            "Ingredients:\n" +
                    "-Chicken 65 Marination\n" +
                    "-1 kg Boneless Chicken chopped\n" +
                    "-2 tbsp Kashmiri Chilli Powder\n" +
                    "-2 tsp Turmeric Powder / Manjal Podi\n" +
                    "-1 tbsp Garam Masala Powder\n" +
                    "-3 tbsp Ginger Garlic Paste\n" +
                    "-4 tbsp Lemon Juice or Vinegar\n" +
                    "-Salt to taste\n" +
                    "-½ cup Curd\n" +
                    "-2 tbsp Rice Flour / Arisi Mavu\n" +
                    "-2 tbsp All Purpose Flour / Maida\n" +
                    "-2 tbsp Corn Flour / Corn Starch\n" +
                    "-½ tsp Baking Power\n" +
                    "-Curry leaves\n" +
                    "-Oil for Deep Frying\n" +
                    "-1 Egg\n" +
                    "-Chicken 65 Seasoning\n" +
                    "-1 sprig Curry leaves-1 spring\n" +
                    "-2 chopped Green Chillies chopped finely\n" +
                    "-4 cloves Garlic chopped finely\n" +
                    "-Salt to taste\n" +
                    "-1 tsp Lemon Juice\n" +
                    "-1 tsp Oil\n" +
                    "-Spicy Sauce for Chicken 65\n" +
                    "-2 tbsp Chilli Garlic paste\n" +
                    "-3 cloves Garlic finely chopped\n" +
                    "-1 medium Onion finely chopped\n" +
                    "-1 tsp Vinegar\n" +
                    "-1 tbsp Tomato ketchup\n" +
                    "-1 tsp Soy sauce\n" +
                    "-1 Green chilli chopped\n" +
                    "-a pinch Ajinomoto optional\n" +
                    "-Salt to taste\n" +
                    "-1 Spring Onion chopped\n" +
                    "\n" +
                    "Instructions:\n" +
                    "•Mix all the ingredients except oil and flour. Leave it to marinate overnight.\n" +"\n" +
                    "•Now take the chicken out of fridge a hour before frying so it comes to room temp.\n" +"\n" +
                    "•Add in egg, rice flour, maida and cornflour. Mix well.\n" +"\n" +
                    "•Drop in hot oil and fry till golden. It will take around 7 to 10 mins depending on the size of the chicken.\n" +"\n" +
                    "•Drain it and serve hot with some fried curry leaves and lemon wedges\n" +"\n" +
                    "•Chicken 65 Coated with Spicy Sauce\n" +"\n" +
                    "•Marinate chicken as mentioned above and deep fry chicken. Set aside.\n" +"\n" +
                    "•In a kadai add oil and sauté some garlic and onions and fry till golden brown. Add in green chilli and sauté well.\n" +"\n" +
                    "•Add in vinegar, ajinomoto, salt and mix well.\n" +"\n" +
                    "•Add in soya sauce, chilli garlic sauce, tomato sauce and mix well.\n" +"\n" +
                    "•Add a little bit of water and bring that to boil and quickly toss in the fried chicken 65 in it.\n" +"\n" +
                    "•Garnish with spring onion and serve hot with a little squeeze of lemon juice.\n" +"\n" +
                    "•Chicken 65 with Fried Seasoning\n" +"\n" +
                    "•Mix all the ingredients and let it marinate for 1 hour.\n" +"\n" +
                    "•Heat oil for deep frying and add in the chicken pieces and fry till golden brown. Drain and set aside..\n" +"\n" +
                    "•Now heat 1 tsp of oil and fry some garlic, green chilli and curry leaves in that.\n" +"\n" +
                    "•Sprinkle some salt and some lemon juice and mix well.\n" +"\n" +
                    "•Add the fried chicken and toss well.\n" +"\n" +
                    "•Serve hot as appetizer.\n",
            "Ingredients:\n" +
                    "-Prepare the Mushroom Boursin Cheese Sauce\n" +
                    "-Salt and pepper to taste\n" +
                    "-Cremini mushrooms, thinly sliced\n" +
                    "-Garlic, minced\n" +
                    "-Shallot, minced\n" +
                    "-Butter, unsalted\n" +
                    "-White wine\n" +
                    "-Boursin cheese\n" +
                    "-Knorr® Professional Culinary Cream Base\n" +
                    "-Prepare the Horseradish Dijon Sauce\n" +
                    "-Hellmann's® Real Mayonnaise\n" +
                    "-Horseradish, fresh, grated\n" +
                    "-Maille Dijon Originale Mustard\n" +
                    "-Prepare the Burger\n" +
                    "-Beef Patty\n" +
                    "-Tomato\t20 slices\n" +
                    "-Hamburger buns, toasted\n" +
                    "-Horseradish Dijon Sauce\n" +
                    "-Onions, grilled\n" +
                    "-Mushroom Boursin Cheese Sauce, prepared\n" +
                    "-Black forest ham, cooked, sliced\t\n" +
                    "\n" +
                    "Instructions:\n" +
                    "•Prepare the Mushroom Boursin Cheese Sauce\n" +"\n" +
                    "•Sauté mushrooms in butter. Add shallots and garlic and cook until shallots are translucent.\n" +"\n" +
                    "•Deglaze the pan with white wine and let reduce by 2/3. Add Knorr® Culinary Cream Base and Boursin cheese and bring to a simmer to melt the cheese. Season to taste with salt and pepper.\n" +"\n" +
                    "•Prepare the Horseradish Dijon Sauce\n" +"\n" +
                    "•Combine all ingredients and chill until use.\n" +"\n" +
                    "•Prepare the Burger\n" +"\n" +
                    "•Cook patty to desired doneness.\n" +"\n" +
                    "•Spread Horseradish Dijon Sauce on bottom bun.\n" +"\n" +
                    "•Build the burger by first topping the patty with Mushroom Boursin Cheese Sauce, then the remaining ingredients.\n",
            "Ingredients:\n" +
                    "-500g / 1 lb prawns / shrimp, raw, , peeled and deveined (Note 1)\n" +
                    "-1 1/2 tbsp vegetable oil (or canola)\n" +
                    "-1 tsp sesame oil , toasted (Note 2)\n" +
                    "-3 garlic cloves , very finely minced\n" +
                    "-2 tsp ginger , grated or finely chopped (can be omitted)\n" +
                    "-1 tsp chilli flakes* (Note 3)\n" +
                    "-1/2 cup (125 ml) water\n" +
                    "-3 tbsp Sriracha (Note 4)\n" +
                    "-2 tsp soy sauce , light or all purpose (Note 5)\n" +
                    "-3 tbsp brown sugar (sub with white)\n" +
                    "-Garnish (optional)\n" +
                    "-Sesame seeds\n" +
                    "-Green onions , finely sliced\n" +
                    "-Red chillies , finely sliced or chopped\n" +
                    "\n" +
                    "Instructions:\n" +
                    "•Heat oil in a large skillet over high heat. Add half the prawns and sear for about 45 seconds on each side until golden, then remove into bowl. Repeat.\n" +"\n" +
                    "•Remove skillet from stove to cool down slightly, turn down to medium.\n" +"\n" +
                    "•Return skillet to stove, heat sesame oil. \n" +"\n" +
                    "•Add garlic, ginger and chilli flakes. Cook until garlic turns golden.\n" +"\n" +
                    "•Add water, then Sriracha, soy sauce and sugar, Stir, increase heat to medium high, and let it simmer for 3 minutes or until the sauce starts to thicken to a thin syrup consistency.\n" +"\n" +
                    "•Return prawns into skillet and toss to coat in sauce and reheat, and cook for 1 - 2 minutes until sauce is reduced and coats the prawns nicely.\n" +"\n" +
                    "•Garnish with sesame seeds, fresh chilli and shallots if desired. Serve with rice to soak up the awesome sauce! (Low carb, low cal option, try Cauliflower Rice) Side salad suggestions in post.\n"+"\n",
            "Ingredients:\n" +
                    "-2 slices bread (prefer thick slices)\n" +
                    "-1 to 2 eggs\n" +
                    "-¼ to ⅓ salt (adjust to taste)\n" +
                    "-2 to 3 tablespoons onion or 2 to 3 shallots or green onions - chopped finely\n" +
                    "-1 green chilies chopped or ¼ teaspoon black pepper as needed\n" +
                    "-2 to 3 tablespoons tomato firm & ripe - deseeded & chopped or bell peppers\n" +
                    "-pinch turmeric (optional)\n" +
                    "-1 tablespoon coriander leaves or parsley (chopped)\n" +
                    "-1 tablespoon oil or butter\n" +
                    "-¼ teaspoon red chili powder (or chilli flakes -optional for sprinkling)\n" +
                    "-1 to 2 slices cheese (optional) (mozzarella or any other)\n" +
                    "\n" +
                    "Instructions:\n" +
                    "•Add chopped onions, chilies, tomatoes, coriander leaves, turmeric and salt to a bowl.\n" +"\n" +
                    "•Break the egg and beat everything well.\n" +"\n" +
                    "•Heat a pan with oil and spread it well.\n" +"\n" +
                    "•Dip one side of the bread in the egg and place over the hot pan and cook until done.\n" +"\n" +
                    "•Set the bread aside and pour the rest of the egg mixture to the pan.\n" +"\n" +
                    "•Cook it until slightly set and then place the cheese (optional), then the bread (untoasted\n" +
                    "side) over it and press.\n" +"\n" +
                    "•Cook until the egg is completely cooked on both the sides.\n" +"\n" +
                    "•Serve egg toast hot.\n"+"\n",
            "Ingredients:\n" +
                    "-1 (12-ounce) portion fresh pizza dough\n" +
                    "-2 ½ tablespoons olive oil, divided\n" +
                    "-2 (6-ounce) skinless, boneless chicken breast halves, cubed\n" +
                    "-1 (4-ounce) link sweet Italian sausage, casing removed\n" +
                    "-¼ cup vertically sliced onion\n" +
                    "-4 ounces cremini mushrooms, sliced\n" +
                    "-1 tablespoon chopped fresh garlic\n" +
                    "-2 teaspoons cornmeal\n" +
                    "-4 ounces fontina cheese, shredded\n" +
                    "-1 red bell pepper, seeded and sliced\n" +
                    "-¾ teaspoon crushed red pepper\n" +
                    "-2 tablespoons chopped parsley\n" +
                    "-2 teaspoons chopped fresh thyme\n" +
                    "\n" +
                    "Instructions:\n" +
                    "•Let dough rest, covered, at room temperature for 30 minutes.\n" +"\n" +
                    "•Preheat oven to 450°.\n" +"\n" +
                    "•Heat a large skillet over medium-high heat. Add 1 1/2 teaspoons oil, chicken, and sausage; sauté 5 minutes. Remove mixture from pan. Add 1 tablespoon oil to pan; swirl. Add onion, mushrooms, and garlic; sauté 5 minutes, stirring constantly.\n" +"\n" +
                    "•Punch dough down. Sprinkle a baking sheet with cornmeal. Roll dough out to a 14-inch circle on baking sheet. Brush dough with 1 tablespoon oil; sprinkle with 2 ounces cheese. Arrange chicken mixture, vegetable mixture, and bell pepper over cheese, leaving a 1/4-inch border. Top with remaining cheese and crushed red pepper. Bake at 450° for 20 minutes or until golden. Sprinkle with herbs. Cut into slices.\n"+"\n",
    };
    private String[] ind_det = {
            "Ingredients:\n" +
                    "-3 tablespoons vegetable oil\n" +
                    "-1 teaspoon ground coriander\n" +
                    "-1 teaspoon ground cumin\n" +
                    "-1 teaspoon ground turmeric\n" +
                    "-1 teaspoon cayenne\n" +
                    "-1 tablespoon garam masala\n" +
                    "-1 tablespoon sweet (not hot) paprika\n" +
                    "-1 cup plain yogurt (can sub buttermilk)\n" +
                    "-2 tablespoons lemon juice\n" +
                    "-4 garlic cloves, minced\n" +
                    "-2 tablespoons minced fresh ginger\n" +
                    "-1 teaspoon salt\n" +
                    "-4 whole chicken leg quarters (drumsticks and thighs), skinless, bone-in\n" +
                    "\n" +
                    "Instructions:\n" +
                    "•Heat the spices in oil:\n" +"\n" +
                    "•Heat the oil in a small pan over medium heat, then cook the coriander, cumin, turmeric, cayenne, garam masala and paprika, stirring often, until fragrant (approximately 2-3 minutes). Let cool completely.\n" +"\n" +
                    "•Whisk spices into yogurt, add lemon juice, garlic, salt, ginger:\n" +"\n" +
                    "•Whisk the cooled spice-oil mixture into the yogurt, then mix in the lemon juice, garlic, salt and ginger.\n" +"\n" +
                    "•Cut deep slashes into chicken, coat with marinade, chill:\n" +"\n" +
                    "•Cut deep slashes (to the bone) in 3-4 places on the leg/thigh pieces. Just make 2-3 cuts if you are using separate drumsticks and thighs. Coat the chicken in the marinade, cover and chill for at least an hour (preferably 6 hours), no more than 8 hours.\n" +"\n" +
                    "•Prepare grill:\n" +"\n" +
                    "•Prepare your grill so that one side is quite hot over direct heat, the other side cooler, not over direct heat. If using charcoal, leave one side of the grill without coals, so you have a hot side and a cooler side. If you are using a gas grill, just turn on one-half of the burners.\n" +"\n" +
                    "•Use tongs to wipe the grill grates with a paper towel soaked in vegetable oil.\n" +"\n" +
                    "•Shake off excess marinade, place chicken on hot side of grill:\n" +"\n" +
                    "•Take the chicken out of the marinade and shake off the excess. You want the chicken coated, but not gloppy.\n" +"\n" +
                    "•Put the chicken pieces on the hot side of the grill and cover. Cook 2-3 minutes before checking.\n" +"\n" +
                    "•Turn the chicken so it is brown (even a little bit charred) on all sides\n" +"\n" +
                    "•Move to cool side of grill, cover and cook:\n" +
                    "•Move chicken to the cool side of the grill. Cover and cook for at least 20 minutes, up to 40 minutes (or longer) depending on the size of the chicken and the temperature of the grill. The chicken is done when its juices run clear.\n" +"\n" +
                    "•Let it rest for at least 5 minutes before serving. It’s also great at room temperature or even cold the next day.\n" +"\n" +
                    "•Serve with naan, and Indian flatbread, or with Indian style rice, with yogurt-based raita on the side.\n"+"\n",
            "Ingredients:\n" +
                    "For the chicken marinade\n" +
                    "-28 oz (800g) boneless and skinless chicken thighs or breasts cut into bite-sized pieces\n" +
                    "-1/2 cup plain yogurt\n" +
                    "-1 1/2 tablespoons minced garlic\n" +
                    "-1 tablespoon minced ginger (or finely grated)\n" +
                    "-2 teaspoons garam masala\n" +
                    "-1 teaspoon turmeric\n" +
                    "-1 teaspoon ground cumin\n" +
                    "-1 teaspoon red chili powder\n" +
                    "-1 teaspoon of salt\n" +
                    "-For the sauce:\n" +
                    "-2 tablespoons olive oil\n" +
                    "-2 tablespoons ghee (or 1 tbs butter + 1 tbs oil)\n" +
                    "-1 large onion, sliced or chopped\n" +
                    "-1 1/2 tablespoons garlic, minced\n" +
                    "-1 tablespoon ginger, minced or finely grated\n" +
                    "-1 1/2 teaspoons ground cumin\n" +
                    "-1 1/2 teaspoons garam masala\n" +
                    "-1 teaspoon ground coriander\n" +
                    "-14 oz (400 g) crushed tomatoes\n" +
                    "-1 teaspoon red chili powder (adjust to your taste preference)\n" +
                    "-1 1/4 teaspoons salt (or to taste)\n" +
                    "-1 cup of heavy or thickened cream (or evaporated milk to save calories)\n" +
                    "-1 tablespoon sugar\n" +
                    "-1/2 teaspoon kasoori methi (or dried fenugreek leaves)\n" +
                    "\n" +
                    "Instructions:\n" +
                    "•In a bowl, combine chicken with all of the ingredients for the chicken marinade; let marinate for 30 minutes to an hour (or overnight if time allows).\n" +"\n" +
                    "•Heat oil in a large skillet or pot over medium-high heat. When sizzling, add chicken pieces in batches of two or three, making sure not to crowd the pan. Fry until browned for only 3 minutes on each side. Set aside and keep warm. (You will finish cooking the chicken in the sauce.)\n" +"\n" +
                    "•Heat butter or ghee in the same pan. Fry the onions until they start to sweat (about 6 minutes) while scraping up any browned bits stuck on the bottom of the pan. \n" +"\n" +
                    "•Add garlic and ginger and sauté for 1 minute until fragrant, then add ground coriander, cumin and garam masala. Let cook for about 20 seconds until fragrant, while stirring occasionally.\n" +"\n" +
                    "•Add crushed tomatoes, chili powder and salt. Let simmer for about 10-15 minutes, stirring occasionally until sauce thickens and becomes a deep brown red colour.\n" +"\n" +
                    "•Remove from heat, scoop mixture into a blender and blend until smooth. You may need to add a couple tablespoons of water to help it blend (up to 1/4 cup). Work in batches depending on the size of your blender.\n" +"\n" +
                    "•Pour the puréed sauce back into the pan. Stir the cream, sugar and crushed kasoori methi (or fenugreek leaves) through the sauce. Add the chicken with juices back into the pan and cook for an additional 8-10 minutes until chicken is cooked through and the sauce is thick and bubbling.\n" +"\n" +
                    "•Garnish with chopped cilantro and serve with fresh, hot garlic butter rice and fresh homemade Naan bread!\n"+"\n",
            "Ingredients:\n" +
                    "For making bhaji (vegetable gravy)\n" +
                    "-3 potatoes (medium-sized) - 250 grams\n" +
                    "-1 to 1.25 cups chopped cauliflower - 120 to 130 grams\n" +
                    "-1 cup chopped carrot\n" +
                    "-1 cup green peas - fresh or frozen\n" +
                    "-⅓ cup chopped french beans - 12 to 14 french beans - optional\n" +
                    "-2.25 to 2.5 cups water - for pressure cooking veggies\n" +
                    "\n" +

                    "Other ingredients:\n"+
                    "-3 tablespoons Butter - salted or unsalted\n" +
                    "-1 teaspoon cumin seeds\n" +
                    "-½ cup finely chopped onion or 1 medium to large onion\n" +
                    "-2 teaspoons Ginger Garlic Paste or 1.5 inch ginger & 5 to 6 medium garlic cloves crushed in a mortar\n" +
                    "-1 teaspoon chopped green chilies or serrano peppers or 1 to 2 green chilies\n" +
                    "-½ cup finely chopped capsicum or 1 medium sized capsicum (green bell pepper)\n" +
                    "-2 cups finely chopped tomatoes (tightly packed) or about 2 to 3 large tomatoes\n" +
                    "-1 teaspoon turmeric powder (ground turmeric)\n" +
                    "-1 teaspoon kashmiri chilli powder or freshly ground 3 to 4 soaked dry kashmiri red chilies\n" +
                    "-2 to 3 tablespoons Pav Bhaji Masala - add as required\n" +
                    "-1.5 to 2 cups water or the stock in which the veggies were cooked, add as needed\n" +
                    "-salt as required\n" +
                    "\n" +

                    "Instructions:\n" +
                    "Cooking veggies\n" +
                    "•Rinse, peel and chop the veggies. You will need 1 cup chopped cauliflower, 1 cup chopped carrot, 3 medium sized potatoes (chopped) and ⅓ cup chopped french beans. You can also add veggies of your choice.\n" +"\n" +
                    "•Add all the above chopped veggies in a 2 litre pressure cooker. Also add 1 cup green peas (fresh or frozen).\n" +"\n" +
                    "•Add 2.25 to 2.5 cups water.\n" +"\n" +
                    "•Pressure cook the veggies for 5 to 6 whistles or for about 12 minutes on medium flame.\n" +"\n" +
                    "•When the pressure settles down on its own, open the cooker and check if the veggies are cooked well. You can even steam or cook the veggies in a pan. The vegetables have be to cooked completely.\n" +"\n" +
                    "•Add 1 teaspoon turmeric powder and 1 teaspoon kashmiri red chilli powder.\n" +"\n" +
                    "•Then add 2 to 3 tablespoons pav bhaji masala. mix very well.\n" +"\n" +
                    "•Adding cooked vegetables\n" +"\n" +
                    "•Add the cooked veggies. Add all of the stock or water from the pressure cooker in which the veggies were cooked. Mix very well.\n" +"\n" +
                    "•Then season with salt as per taste.\n" +"\n" +
                    "•With a potato masher, begin to mash the veggies directly in the pan.\n" +"\n" +
                    "•You can mash the veggies less or more according to the consistency you want. For a smooth mixture mash more. For a chunky pav bhaji, mash less.\n" +"\n" +
                    "•Keep on stirring occasionally and let the bhaji simmer for 8 to 10 minutes. \n" +"\n" +
                    "•If the bhaji looks dry and then add some more water. The consistency is neither very thick nor thin.\n" +"\n" +
                    "•Do stir often so that the bhaji does not stick to the pan. When the pav bhaji simmers to the desired consistency, check the taste. Add salt, pav bhaji masala, red chili powder or butter if required.\n" +"\n" +
                    "•When the bhaji is simmering, you can fry the pav so that you serve the pav with hot bhaji.\n" +"\n" +
                    "•Slice the pavs.\n" +"\n" +
                    "•You can turn over and toast them more if required. Then remove in a plate and keep aside.\n"+"\n",
            "Ingredients:\n" +
                    "For making samosa pastry\n" +
                    "-2 cups all-purpose flour (maida), 250 grams\n" +
                    "-1 teaspoon carom seeds\n" +
                    "-1 teaspoon salt or add as required\n" +
                    "-6 tablespoons Ghee (clarified butter), 50 grams\n" +
                    "-7 to 8 tablespoons water or add as required\n" +
                    "For cooking potato & peas\n" +
                    "-3 potatoes medium-sized, 300 to 350 grams or 3 cups chopped boiled potatoes\n" +
                    "-½ cup green peas - 180 grams, fresh - can use frozen peas\n" +
                    "-2 cups water - for steaming\n" +
                    "\n" +

                    "Other ingredients\n" +
                    "-1 tablespoon oil - I used mustard oil. sunflower, canola, grapeseed oil can be used\n" +
                    "-½ teaspoon cumin seeds\n" +
                    "-1 teaspoon ginger - finely chopped, or 1 inch peeled ginger\n" +
                    "-2 teaspoons green chillies - finely chopped or 2 tsp finely chopped serrano peppers or 1 to 2 green chillies\n" +
                    "-½ teaspoon red chili powder or cayenne pepper\n" +
                    "-1 pinch asafoetida (hing) - optional\n" +
                    "-1 to 2 teaspoons dry mango powder (amchur)\n" +
                    "-salt as required\n" +
                    "-1 tablespoon coriander leaves (cilantro), chopped\n" +
                    "-oil for deep frying - as required, any neutral flavored oil\n" +
                    "-Whole spices to be ground\n" +
                    "-½ inch cinnamon\n" +
                    "-1 clove - optional\n" +
                    "-3 black peppercorns\n" +
                    "-1 green cardamom\n" +
                    "-½ teaspoon cumin seeds\n" +
                    "-½ teaspoon fennel seeds\n" +
                    "-2 teaspoons coriander seeds\n" +
                    "\n" +
                    "Instructions:\n" +
                    "•Making the samosa pastry dough\n" +"\n" +
                    "•Take the flour, carom seeds, salt in a bowl. Mix well and add ghee.\n" +"\n" +
                    "•With your fingertips rub the ghee or oil in the flour to get a breadcrumb like consistency.\n" +"\n" +
                    "•The whole mixture should clump together when joined and not fall apart.\n" +"\n" +
                    "•Add water in parts and knead to a firm dough.\n" +"\n" +
                    "•If the dough looks dry or floury, then add 1 to 2 tablespoons more water and knead.\n" +"\n" +
                    "•Cover the dough with a moistened napkin and set aside for 30 minutes.\n" +"\n" +
                    "•Making potato and peas stuffing\n" +"\n" +
                    "•Steam or boil the potatoes and peas till are cooked completely. Drain them of any extra water in a colander or sieve.\n" +"\n" +
                    "•Peel the boiled potatoes and chop them into small cubes\n" +"\n" +
                    "•Dry roast all the whole spices mentioned in the above list until fragrant taking care not to burn them.\n" +"\n" +
                    "•When the spices are warm or cool at room temperature, grind them in a dry grinder or coffee grinder to a semi-fine or fine powder.\n" +"\n" +
                    "•Heat oil in a pan. Add the cumin seeds and crackle them.\n" +"\n" +
                    "•Add the ginger and green chillies. Sauté for a few seconds until the raw aroma of ginger goes away.\n" +"\n" +
                    "•Add the steamed green peas, red chili powder, the freshly ground spice powder, dry mango powder and asafoetida.\n" +"\n" +
                    "•Stir and sauté on a low heat for 1 to 2 minutes.\n" +"\n" +
                    "•Add the potato cubes. Mix very well and sauté for about 2 to 3 minutes on low heat with frequent stirring.\n" +"\n" +
                    "•Set aside the potato filling aside to cool at room temperature.\n" +"\n" +
                    "•Assembling & shaping samosa\n" +"\n" +
                    "•After resting the dough for 30 minutes, divide the dough in 6 equal pieces.\n" +"\n" +
                    "•Take each piece and roll in your palms first to make a smooth ball.\n" +"\n" +
                    "•Then roll it with a rolling pin keeping the thickness to 1 mm throughout.\n" +"\n" +
                    "•Cut with a knife or a pastry cutter through the center of the rolled samosa pastry.\n" +"\n" +
                    "•With a brush or with your fingertips, spread some water all over the edges.\n" +"\n" +
                    "•Join the two straight ends forming a cone shape.\n" +"\n" +
                    "•Press the edges so that they get sealed well.\n" +"\n" +
                    "•Stuff the prepared samosa cone with the prepared potato-peas stuffing.\n" +"\n" +
                    "•Pinch a part on the edge (check the video & photos). This helps the samosa to stand once it is shaped.\n" +"\n" +
                    "•Press both the edges. Be sure there are no cracks.\n" +"\n" +
                    "•Prepare all the samosa this way and keep covered with a moist kitchen napkin.\n" +"\n" +
                    "•Frying Samosa\n" +"\n" +
                    "•Now heat oil for deep frying in a kadai or pan. Once the oil becomes hot (test by adding a small piece of dough – it should come up quickly once added to the hot oil).\n" +"\n" +
                    "•Gently slide the prepared stuffed samosa & quickly reduce the flame to low.\n" +"\n" +
                    "•Turnover in between and fry until golden. Drain the fried samosa on paper towels to remove excess oil.\n" +"\n" +
                    "•Fry them in batches. For frying the second batch, again increase the temperature of the oil to medium-heat. Do not overcrowd the pan while frying.\n" +"\n" +
                    "•Add the samosa and then lower the flame, thereby decreasing the temperature of oil.\n" +"\n" +
                    "•This way fry all the samosa in batches.\n"+"\n",
            "Ingredients:\n" +
                    "For pani puri stuffing\n" +
                    "-2 to 3 potatoes - medium-sized\n" +
                    "-1 onion - small to medium-sized, optional\n" +
                    "-1 to 1.5 tablespoons chopped coriander leaves (cilantro)\n" +
                    "-1 teaspoon roasted cumin powder\n" +
                    "-1 teaspoon chaat masala powder\n" +
                    "-¼ teaspoon red chili powder - optional\n" +
                    "-black salt or regular salt or pink salt, as required\n" +"\n" +

                    "For pani recipe\n" +
                    "-½ cup chopped mint leaves - tightly packed,\n" +
                    "-1 cup chopped coriander leaves - tightly packed (cilantro)\n" +
                    "-1 inch ginger - chopped\n" +
                    "-2 to 3 green chilies - chopped (for a less spicy pani, add about 1 green chili)\n" +
                    "-1 tablespoon tamarind - tightly packed\n" +
                    "-3.5 to 4 tablespoons jaggery powder or grated/chopped jaggery or sugar, add as required - check point 6 in notes\n" +
                    "-1 teaspoon roasted cumin powder\n" +
                    "-1 teaspoon chaat masala powder\n" +
                    "-⅓ cup water for blending\n" +
                    "-1 to 1.25 cups water to be added later, add water as per the consistency you want\n" +
                    "-1 to 1.5 tablespoons boondi (fried tiny gram flour balls), optional\n" +
                    "-black salt or regular salt, add as required\n" +"\n" +

                    "Other ingredients\n" +
                    "-24 to 30 puris you could buy these puris readymade or make them at home\n" +
                    "-1 small bowl Tamarind Chutney or tamarind dates chutney - optional\n" +
                    "\n" +

                    "Instructions:\n" +
                    "•Making pani puri stuffing\n" +"\n" +
                    "•Boil the potatoes till they are cooked completely.\n" +"\n" +
                    "•Peel them and then chop them.\n" +"\n" +
                    "•Finely chop the onion if using it.\n" +"\n" +
                    "•In a small bowl, mix the potatoes, onions, coriander leaves, cumin powder, chaat masala powder and black salt or regular salt. Mix well and keep aside.\n" +"\n" +
                    "•Making pani (spiced water)\n" +"\n" +
                    "•In a blender add all the ingredients mentioned above for the pani.\n" +"\n" +
                    "•Add water and grind to a fine chutney.\n" +"\n" +
                    "•Remove the green chutney in a large bowl. Rinse the mixer jar with ½ cup water first and then add this water in the bowl. Then add ½ to ¾ cup more water.\n" +"\n" +
                    "•Mix well. Check the seasoning. Add more salt or jeera powder or chaat masala or jaggery if required. If you want a thin pani, you could add some water. But keep on checking the seasoning, as per your taste.\n" +"\n" +
                    "•Add the boondi to the pani.\n" +"\n" +
                    "•You can chill the pani in the fridge or add some ice cubes to it.\n" +"\n" +
                    "•Assembling pani puri\n" +"\n" +
                    "•Crack the top of the puri with a spoon.\n" +"\n" +
                    "•Add 2 to 3 teaspoons of the boiled potato-onion filling in the poori.\n" +
                    "•Stir the green pani first and then add it in the poori. Optionally you can add some sweet chutney in the puri. \n" +"\n" +
                    "•Serve the pani puri immediately otherwise the prepared puri with stuffing and water will become soggy.\n" +"\n" +
                    "•You can also make individual portions with the puris, potato-onion mixture and the pani. Let the individual assemble the pani puri for himself/herself as per his/her taste.\n"+"\n",
    };
    private String[] ita_det = {
            "Ingredients:\n" +
                    "For pizza crust\n"+
                    "-3 to 3.25 cups all-purpose flour or bread flour (unbleached), 375 grams\n" +
                    "-½ teaspoon sugar\n" +
                    "-1 cup warm water or add as required\n" +
                    "-1.5 teaspoons instant yeast 4 to 5 grams or 2 teaspoons dry active yeast\n" +
                    "-3 tablespoons olive oil\n" +
                    "-1 teaspoon salt or add as required\n" +
                    "-1 to 2 teaspoons olive oil for brushing dough\n" +
                    "-Semolina or cornmeal (makki ka atta) or all-purpose flour for sprinkling on pan\n" +"\n" +

                    "For pizza sauce\n" +
                    "-5 to 6 medium tomatoes - 500 grams\n" +
                    "-2 teaspoons minced garlic or 8 to 10 small to medium garlic cloves, 5 grams peeled garlic\n" +
                    "-¼ cup olive oil\n" +
                    "-¼ cup chopped basil or 3 to 4 teaspoons dried basil\n" +
                    "-2 teaspoons dried oregano or 2 tablespoons fresh oregano\n" +
                    "-Freshly crushed black pepper or ground black pepper, as required\n" +
                    "-Salt as required\n" +
                    "\n" +
                    "Toppings\n" +
                    "-1 onion sliced or cut in cubes\n" +
                    "-1 capsicum (bell pepper), sliced or cubed\n" +
                    "-1 tomato chopped or sliced - optional\n" +
                    "-10 to 12 pitted green olives sliced, optional\n" +
                    "-10 to 12 pitted black olives sliced, optional\n" +
                    "-½ cup steamed sweet corn kernels or canned corn kernels\n" +
                    "-⅓ cup sliced baby corn\n" +
                    "-⅓ to ½ cup sautéed kale\n" +
                    "-⅓ cup sautéed spinach\n" +
                    "-⅓ to ½ cup cauliflower, fennel, brussel sprouts, cabbage (steamed, roasted or sautéed)\n" +
                    "-½ to 1 cup sautéed button mushrooms\n" +
                    "-⅓ to ½ cup broccoli or french beans (blanched or sautéed)\n" +
                    "-Italian seasoning - as required\n" +
                    "-Mozzarella cheese or pizza cheese, as required\n" +
                    "-Parmesan cheese (vegetarian), as required\n"+
                    "-Red chili flakes - as required\n" +
                    "\n" +
                    "Instructions:\n" +
                    "Making pizza dough\n" +
                    "•In a large mixing bowl take the instant yeast, sugar and lukewarm water.\n" +"\n" +
                    "•Stir and let the mixture sit at room temperature for 10 to 15 mins till it becomes frothy,\n" +"\n" +
                    "•Add one cup flour, salt, olive oil to the frothy yeast mixture.\n" +"\n" +
                    "•Mix well. Add another cup of flour and mix again. The mixture becomes sticky.\n" +"\n" +
                    "•Add the last cup of flour and continue to stir.\n" +"\n" +
                    "•Knead the dough into a smooth, springy ball. Apply some olive oil all over the dough.\n" +"\n" +
                    "•Cover loosely and keep in a large bowl at room temperature for 45 minutes to 1 hour.\n" +"\n" +
                    "•The dough will double up and nicely leaven.\n" +"\n" +
                    "•Making pizza sauce\n" +
                    "Crush or make a smooth puree of the tomatoes in a blender.\n" +"\n" +
                    "•Heat olive oil. Fry the minced garlic for some seconds. Add the tomato puree. Mix and let cook uncovered for 5 minutes.\n" +"\n" +
                    "•Season with salt and mix. Cover and simmer the tomato sauce on low heat for 20 minutes, stirring occasionally, until the tomatoes have softened.\n" +"\n" +
                    "•If the sauce looks too thick you can add ¼ cup water. Then cover and continue to cook.\n" +"\n" +
                    "•Add the herbs and crushed black pepper. Mix well.\n" +"\n" +
                    "•Assembling and baking veg pizza\n" +
                    "•Preheat your oven at 230 degrees Celsius (450 degrees Fahrenheit) for 20 minutes.\n" +"\n" +
                    "•Cut the dough in 3 or 4 equal parts. Flatten the dough to a disk. On a lightly floured surface roll the dough having ⅛ to ¼ inch thickness.\n" +"\n" +
                    "•Place the dough onto a greased and dusted pan.\n" +"\n" +
                    "•Brush some olive oil on the pizza base. Spread the tomato sauce on the pizza.\n" +"\n" +
                    "•Top shredded mozzarella cheese and veggies.\n" +"\n" +
                    "•Sprinkle some grated parmesan cheese.\n" +"\n" +
                    "•Keep the tray near or close to the bottom heating element of your oven.\n" +"\n" +
                    "•Bake for 10 to 15 minutes at 230 degrees Celsius (450 degrees Fahrenheit) until the base becomes golden brown and the cheese on top melts.\n" +"\n" +
                    "•Wait for a minute or two and serve veggie pizza while still hot.\n"+"\n",
            "Ingredients:\n" +
                    "Meat\n" +
                    "-1 lb 85-90% lean ground beef, lean\n" +
                    "-Produce\n" +
                    "-1 Basil, Fresh\n" +
                    "-2 Garlic cloves\n" +
                    "-2 tbsp Onion\n" +
                    "-Refrigerated\n" +
                    "-1 Eggs, large\n" +
                    "-Condiments\n" +
                    "-25 oz Marinara\n" +
                    "-Pasta & Grains\n" +
                    "-12 oz Spaghetti noodles\n" +
                    "-Baking & Spices\n" +
                    "-1/4 tsp Black pepper\n" +
                    "-2 tsp Italian seasoning\n" +
                    "-1/2 tsp Salt\n" +
                    "-Oils & Vinegars\n" +
                    "-2 tbsp Olive oil\n" +
                    "-Bread & Baked Goods\n" +
                    "-1/4 cup Breadcrumbs\n" +
                    "-Dairy\n" +
                    "-1/4 cup Parmesan cheese, grated\n" +
                    "\n" +
                    "Instructions:\n" +
                    "•Use your hands when combining the meatballs mixture. It will be so much faster to use your hands and easier to make sure that all the ingredients are will combined.\n" +"\n "+
                    "•Use an ice cream scoop with a trigger release to make the meatballs. That makes it go by much quicker and creates evenly-sized meatballs. I also have this nonstick meat baller (Amazon affiliate link), which works really well and no meat sticks to it.\n" +"\n "+
                    "•Don’t overcrowd the skillet when cooking the meatballs. You want to leave at least an inch in between the meatballs so they don’t end up steaming. We want to get a nice sear on them instead. Work in batches if necessary or just use a large skillet to fit the full recipe like I did.\n" +"\n "+
                    "•Cook the pasta al dente and don’t rinse. For the best texture of these spaghetti and meatballs, don’t fully cook the pasta because you’ll be tossing it with the marinara sauce and meatballs, which will further cook and soften it.\n"+"\n ",
            "Ingredients:\n" +
                    "Meat\n" +
                    "-3 Beef neck bones\n" +
                    "-1 lb Italian sausage\n" +
                    "-2 tbsp Basil, dried\n" +
                    "-1/2 Carrot\n" +
                    "-1/2 cup Celery\n" +
                    "-10 Garlic cloves\n" +
                    "-3 (28 ounce) cans Italian inspirations peeled plum tomatoes in puree\n" +
                    "-1/4 cup Italian parsley, fresh\n" +
                    "-1/2 cup Onion\n" +
                    "-2 tbsp Oregano, dried\n" +
                    "-Canned Goods\n" +
                    "-2 (6 ounce) cans Tomato paste\n"+"\n"+
                    "Condiments\n" +
                    "1 (28 ounce) can Tomato sauce\n" +
                    "Baking & Spices\n" +
                    "1 Salt and black pepper\n" +
                    "Oils & Vinegars\n" +
                    "1/4 cup Olive oil, extra virgin\n" +
                    "Beer, Wine & Liquor\n" +
                    "1 cup Red wine\n" +
                    "Liquids\n" +
                    "1 qt Water\n"+"\n" +

                    "Instructions:\n" +
                    "•Heat the olive oil in a large pot or Dutch oven over medium heat.\n" +"\n"+
                    "•Add the finely chopped onion and cook until it becomes translucent, usually about 5 minutes.\n" +"\n"+
                    "•Stir in the minced garlic and red pepper flakes. Cook for an additional 1-2 minutes until the garlic is fragrant but not browned.\n" +"\n"+
                    "•Add the cans of whole tomatoes, crushing them with your hands as you add them to the pot. Be careful as the tomatoes may splatter.\n" +"\n"+
                    "•Season with dried oregano, dried basil, salt, and black pepper. Stir well to combine.\n"+"\n"+
                    "•If you want to add some wine, pour in the red wine at this point. Stir and allow it to simmer for about 5 minutes, letting the alcohol evaporate and the flavors meld.\n" +"\n"+
                    "•Reduce the heat to low and let the gravy simmer, uncovered, for 1 to 1.5 hours. Stir occasionally and break up the tomatoes as they soften with the back of a wooden spoon.\n" +"\n"+
                    "•Taste the sauce and adjust the seasoning if needed. You can add more salt, pepper, or red pepper flakes to suit your preferences.\n" +"\n"+
                    "•Once the sauce thickens and reduces, and the flavors have melded together, it's ready. If it becomes too thick, you can add a little water to achieve your desired consistency.\n" +"\n"+
                    "•Remove the pot from heat. Stir in the fresh basil and parsley. This adds a burst of fresh flavor to the sauce\n"+"\n"+
                    "•Your Italian gravy is now ready to use in your favorite Italian dishes like pasta, lasagna, or any recipe that calls for a rich tomato sauce.\n"+"\n",


            "Ingredients:\n" +
                    "Italian Grilled Cheese\n" +
                    " -1 tablespoon olive oil\n" +
                    " -2 ounces thinly sliced prosciutto\n" +
                    " -8 ounces ricotta cheese\n" +
                    " -¼ cup homemade* or store-bought pesto\n" +
                    " -3 ounces provolone cheese , freshly grated\n" +
                    " -3 ounces fontina cheese , freshly grated\n" +
                    " -¼ cup marinated sun-dried tomatoes\n" +
                    " -6 tablespoons butter , room temperature\n" +
                    " -¼ cup parmesan cheese , freshly grated\n" +
                    " -2 tablespoons fresh parsley , chopped\n" +
                    " -4 slices Tuscan or sourdough bread , ½-inch thick\n" +
                    " -3 ounces marinated roasted red peppers , drained and patted dry\n" +
                    " -Kosher salt and black pepper\n" +
                    "*Basil & Parsley Pesto\n" +
                    " -1 cup loosely packed fresh basil leaves\n" +
                    " -1 cup loosely packed fresh parsley\n" +
                    " -2 large cloves garlic , peeled\n" +
                    " -½ cup parmesan cheese , freshly grated\n" +
                    " -½ lemon , juiced\n" +
                    " -¼ cup pine nuts (optional)\n" +
                    " -⅓ cup extra-virgin olive oil\n" +
                    "\n" +
                    "Instructions:\n" +
                    "Italian Grilled Cheese\n" +
                    "•Heat olive oil in a large cast iron or non-stick skillet over medium heat.\n" +"\n" +
                    "•Add prosciutto in a single layer and cook until starting to get crisp but not dry. Remove from skillet when done and place on a paper towel-lined plate. Set aside. Remove skillet from heat.\n" +"\n" +
                    "•In a medium bowl, whip ricotta with either homemade or your favorite store-bought pesto with a hand mixer or whisk until well combined. Set aside.\n" +"\n" +
                    "•In another medium bowl, combine provolone and fontina cheese with sun-dried tomatoes. Set aside.\n" +"\n" +
                    "•In a small bowl, use a hand mixer or whisk to blend softened butter, parmesan cheese and parsley. Season with salt and pepper, to taste. Set aside.\n" +"\n" +
                    "•To assemble sandwiches, place the 4 slices of bread on a work surface. Slather each slice with the pesto ricotta (reserve extra for another use). Top 2 of the slices with about a ½ cup or so of the grated cheese blend.\n" +"\n" +
                    "•Top the cheese with roasted red peppers and prosciutto. Add a little more of the grated cheeses and place the other 2 slices on top ricotta side down and press slightly to hold together.\n" +"\n" +
                    "•Heat same skillet used for the prosciutto over medium heat.\n" +"\n" +
                    "•In an even layer spread herb butter on top of each sandwich. Carefully place sandwiches buttered side down in skillet. Spread butter on the top side of the sandwiches.\n" +"\n" +
                    "•Cook until the bottom side is golden brown and crisp, about 5 minutes. Carefully flip the sandwiches and cook another 5 minutes on the other side until golden and the cheese has completely melted.\n" +"\n" +
                    "•Let sandwiches rest a couple minutes before serving. Enjoy!\n" +"\n" +
                    "\n" +
                    "*Basil & Parsley Pesto\n" +
                    "•Add basil, garlic, parmesan, and pine nuts to bowl of a food processor. Pulse until well combined.\n" +"\n" +
                    "•With the machine running, slowly pour in the oil. Process until desired consistency.\n" +"\n" +
                    "•Season to taste with salt and pepper. (Makes about ¾ cup. Can be made ahead. Transfer to an airtight container and refrigerate up to 5 days.)\n"+"\n",
            "Ingredients:\n" +
                    "Slaw\n" +
                    "-1/2 head green cabbage, fine shredded\n" +
                    "-1/2 large cucumber\n" +
                    "-3 tbs dill, chopped\n" +
                    "-1/4 cup champagne vinegar (or white wine vinegar)\n" +
                    "-Salt and pepper to taste\n" +
                    "-Spicy avocado mash:\n" +
                    "-3 avocadoes\n" +
                    "-1-2 tsp Sriracha sauce\n" +
                    "-1 lime, juiced\n" +
                    "-Salt and pepper to taste\n" +
                    "-Salmon:\n" +
                    "-2 lbs salmon, skin removed\n" +
                    "-2 tsp chipotle powder (or chili powder)\n" +
                    "-1 tsp onion powder\n" +
                    "-1 tsp dried oregano\n" +
                    "-1 lime, zested + juiced\n" +
                    "-8 small corn tortillas\n" +
                    "\n" +
                    "Instructions:\n" +
                    "Slaw:\n" +
                    "•Leave the skin on your cucumber. Slice your cucumber in half lengthwise. Remove seeds and then slice thin.\n" +"\n" +
                    "•Mix everyhting in a large bowl, cover and place in your fridge while you make everything else.\n" +"\n" +
                    "Avocado mash:\n" +"\n" +
                    "•In a medium bowl, rough mash your avocados. Add in the rest of the ingredients and mix to combine.\n" +"\n" +
                    "Salmon:\n" +"\n" +
                    "•Pat your fish dry with paper towel. Slice the filet into large chunks. Transfer to a bowl and mix with the seasonings, lime zest and juice to coat.\n" +"\n" +
                    "•In a large skillet, working in two batches, add 1/2 tbs olive oil. Once pan is hot add in the salmon pieces and cook until crispy and done. Remove to a plate lined with paper towel. Wipe the pan clean and repeat with the rest of the salmon.\n" +"\n" +
                    "•Heat your tortillas in a pan or wrapped in a stack, in aluminum foil in your small toaster oven.\n"+"\n",
    };
    private String[] chi_det = {
            "Ingredients:\n" +
                    "For the beef:\n" +
                    "-10 ounces flank steak (285g, cut into bite-sized pieces)\n" +
                    "-¼ teaspoon salt\n" +
                    "-1 tablespoon water\n" +
                    "-For the rest of the dish:\n" +
                    "-1 tablespoon hot water\n" +
                    "-¼ teaspoon sugar\n" +
                    "-½ teaspoon sesame oil\n" +
                    "-1½ tablespoons soy sauce\n" +
                    "-2 teaspoons dark soy sauce\n" +
                    "-Fresh ground white pepper\n" +
                    "-5 cups cooked rice\n" +
                    "-3 tablespoons canola oil (divided)\n" +
                    "-2 eggs (beaten)\n" +
                    "-1 medium onion (diced)\n" +
                    "-3/4 cup peas\n" +
                    "-1 scallion (chopped)\n\n" +
                    "Instructions:\n" +
                    "•First, combine the beef, salt, water, baking soda, dark soy sauce, cornstarch, and oil in a bowl and stir until well-incorporated. Set aside.\n" +"\n" +
                    "•Next, combine the hot water, sugar, sesame oil, soy sauces, and white pepper in a small bowl. \n" +"\n" +
                    "•Take your cooked rice and fluff it with a fork or with your hands \n" +"\n" +
                    "•Add the marinated beef in one layer, and let sear for 20 seconds. Next, stir fry the beef until about 70% done. Transfer the beef back to the marinade bowl, and set aside.\n" +"\n" +
                    "•With the wok over medium high heat, add the last tablespoon of oil, and sauté the onions until translucent, about 2 minutes.\n" +"\n" +
                    "•Once the rice is warmed through, add the sauce mixture. Stir the rice with a scooping motion until the grains are evenly coated with sauce. The rice should be completely hot by now. \n" +"\n" +
                    "•Next, add the beef and any juices from the bowl you set aside earlier, and stir fry for another minute.\n" +"\n" +
                    "•Add the eggs, breaking up any large clumps, peas, and the scallions. Continue stir-frying for another 30 seconds. At this point, taste the rice to see if it needs a little more salt, soy sauce, or white pepper and season accordingly.\n" +"\n" +
                    "•Serve immediately, and, if you’re like us, don’t forget some homemade chili oil!\n"+"\n",
            "Ingredients:\n" +
                    "-3 scallions (cut into 2-inch long pieces, with the white and green parts separated)\n" +
                    "-4 cloves garlic (cut in half)\n" +
                    "-6 slices ginger (1/4 inch thick)\n" +
                    "-1 tablespoon vegetable oil (can substitute canola oil or avocado oil)\n" +
                    "-24 ounces boneless skinless chicken thighs (680g, cut into 1-inch chunks)\n" +
                    "-3 shallots (cut into quarters)\n" +
                    "-1/4 cup Shaoxing wine\n" +
                    "-1 teaspoon dark soy sauce\n" +
                    "-1/4 teaspoon white pepper\n" +
                    "-2 teaspoons oyster sauce (optional)\n" +
                    "-1 tablespoon cornstarch (mixed with 1 tablespoon water)\n" +
                    "\n" +
                    "Instructions:\n" +
                    "•Using a cleaver, lightly smash the white parts of the scallions, the garlic, and the ginger (use a firmer hand on the ginger). This releases the flavors of the aromatics for a more flavorful dish.\n" +"\n" +
                    "•Spread the canola oil around the perimeter of the wok, and heat it until it just starts smoking. Add the smashed ginger slices, and fry for 15 seconds.\n" +"\n" +
                    "•Spread the chicken pieces in a single layer in the wok. Sear for 45 seconds. Flip them and fry the other side for another 30 seconds.\n" +"\n" +
                    "•Add in the white parts of the scallions, garlic, and shallots. Continue to stir-fry over high heat, mixing everything together for another 30 seconds.\n" +"\n" +
                    "•Add the Shaoxing wine, and stir-fry again for 20 seconds. Next, add in the chicken stock, brown sugar, soy sauce, dark soy sauce, white pepper, and oyster sauce (optional, but it’ll give the dish a nice additional flavor!). Cover and continue to cook on high heat for 5 minutes.\n" +"\n" +
                    "•Remove the cover, and cook for another 7 minutes to reduce the liquid. Mix in the green parts of the scallions, and then immediately stir in the cornstarch and water mixture to thicken the sauce. Add more cornstarch slurry if you like a thicker sauce.\n"+"\n",
            "Ingredients: \n" +
                    "For Hot garlic Sauce:\n" +
                    "-A load of garlic\n" +
                    "-Whole dry red chilies (sabut lal mirch)\n" +
                    "-Red Chili Flakes\n" +
                    "-Brown sugar\n" +
                    "-Soy sauce\n" +
                    "-Sriracha Sauce or red chili paste\n" +
                    "-Sesame oil\n\n" +
                    "Instructions:\n" +
                    "•Chop Vegetables: Wash, clean, and chop a choice of vegetables into bite-size pieces (you can use bok choy, carrot, bean sprouts, broccoli, bell peppers, wild mushrooms, tofu, or whatever you like).\n" +"\n" +
                    "•Aromatics: Peel and finely chop garlic – this is the dish’s star – add a little more quantity than usual for a stronger flavor. Similarly, finely chop ginger and celery as well.\n" +"\n" +
                    "•Prepare Sauce Mix: Combine brown sugar, red chili flakes, soy sauce, and sriracha sauce. Mix nicely and keep aside till required.\n" +"\n" +
                    "•Cornflour Paste: Mix cornflour in water in a small bowl to form a thick paste/slurry and set aside. \n" +"\n" +
                    "•Stir-Fry Vegetables: Add oil to your favorite Chinese wok and wait until it gets hot. Now add in all the vegetables and stir fry on high heat. Make sure not to cook vegetables for too long. Transfer to a plate and use the same pan for making hot garlic sauce.\n" +"\n" +
                    "•Prepare Gravy: To the same wok, add sesame oil and wait till it gets hot. Add finely chopped garlic, ginger, celery, and whole red chilies. \n" +"\n" +
                    "•Once the sauce reaches a sweet corn-soup like consistency, add the stir-fried vegetables and cook for 3 – 5 minutes. Turn off the heat.\n",
            "Ingredients:\n" +
                    "For the chicken \n" +
                    "-1 piece chicken breast about 180g/6.3oz\n" +
                    "-½ tbsp cornstarch, or tapioca starch\n" +
                    "-1 pinch salt\n" +
                    "-1 tbsp water\n" +
                    "-1 tsp sesame oil\n" +"\n" +

                    "For the sauce\n" +
                    "-1 tbsp light soy sauce\n" +
                    "-1 tsp dark soy sauce\n" +
                    "-1 tbsp oyster sauce\n" +
                    "-1 pinch black pepper, freshly ground\n" +
                    "-2 cloves garlic, sliced\n" +
                    "-Fresh chilli, sliced to taste\n" +
                    "-80 g bean sprouts about 1½ cup\n" +
                    "-400 g ready-to-fry chow mein noodles\n\n" +
                    "Instructions:\n" +
                    "•Cut chicken breast into thin slices. Mix with cornstarch, salt and water until well incorporated. Pour in sesame oil. Stir to coat evenly.\n" +"\n" +
                    "•Mix light soy sauce, dark soy sauce, oyster sauce and black pepper. Set aside.\n" +"\n" +
                    "•Heat up a wok/skillet until very hot. Add 1 tablespoon of oil (see note 4 if using non-stick cookware). \n" +"\n" +
                    "•Add the chicken, bok choy and bean sprouts then pour in the sauce mixture. Toss and mix until the seasoning is evenly distributed and everything becomes piping hot.\n" +"\n" +
                    "•Garnish with the green part of the scallion. Dish out and serve immediately.\n"+"\n",
            "Ingredients:\n" +
                    "For Dough:\n" +
                    "-2 cups all purpose flour 260 grams\n" +
                    "-1/4 teaspoon salt\n" +
                    "-1/2 cup + 1-2 tablespoons water to knead the dough, 120 ml + 15-30 ml\n" +"\n" +

                    "Filling:\n" +
                    "-1.5 tablespoons oil\n" +
                    "-3 large garlic cloves chopped\n" +
                    "-2 green chilies chopped\n" +
                    "-1.5 cups cabbage shredded\n" +
                    "-1/2 teaspoon salt or to taste\n" +
                    "-1/4-1/2 teaspoon black pepper to taste\n" +
                    "-2 cups paneer grated, from around 240 grams\n" +
                    "-1.5 teaspoons soy sauce\n" +"\n" +

                    "For Schezwan Momos:\n" +
                    "-2 teaspoons oil\n\n" +
                    "Instructions:\n" +
                    "Make the filling\n"+
                    "•Heat 1.5 tablespoon oil in a pan on medium heat. Once the oil is hot, add the chopped garlic, green chili and 1/2 cup chopped green onion. Sauté for 1 minute.\n" +"\n" +
                    "•Then add 1/3 cup grated carrots, stir and cook for 30 to 60 seconds. Add 1.2 cups shredded cabbage and 3/4 cup finely chopped green pepper and cook for 1 to 2 minutes, stirring often.\n" +"\n" +
                    "•Then add salt and pepper and mix. Add 2 cups grated paneer and mix well.\n" +"\n" +
                    "Make the dough\n"+
                    "•To a large bowl, add the flour and salt. Mix to combine.\n" +"\n" +
                    "•Start adding warm water, little by little and mix. Bring the dough together, don't try to add too much water. We don't want a soft dough.\n" +"\n" +
                    "•You should have a circle of 3 to 3.5 inches in diameter. Dust it with dry flour and keep it covered. I usually like to roll 5 to 6 at a time, then fill and shape them and steam before working on rolling more wrappers.\n" +"\n" +

                    "Fill, shape & steam\n"+
                    "•Then make pleats using your fingers. Make a pleat and then pinch the edges together. Keep making pleats until you reach the end of the other side. Pinch to seal the other corner and then press the edges to give the momo a half moon kind of shape. Shape all momos similarly.\n" +"\n" +
                    "•Toss in Schezwan Sauce\n" +"\n" +
                    "•Garnish with lots of chopped cilantro and green onions. Serve hot!\n"+"\n",
    };
    private String[] des_det = {
            "Ingredients:\n" +
                    "For the Syrup\n" +
                    "-3 cups – Sugar\n" +
                    "-3 Green Cardamom pods\n" +
                    "-5 cups – Water\n" +
                    "-2  drops of Lemon Juice, optional\n" +
                    "-A pinch of saffron\n" +
                    "-1 – tbsp – Rose water\n" +"\n" +

                    "For the Jamun\n" +
                    "Ingredients (option 1)\n" +
                    "-250 gms – Khova (store bought or homemade)\n" +
                    "-3 tbsps – All purpose flour\n" +
                    "-1/8 tspn – Baking soda\n" +
                    "-1 tbsp – Milk\n" +
                    "-Oil or Ghee for deep frying\n" +
                    " Ingredients (option 2)\n" +
                    "-200 gms – Khova\n" +
                    "-50 gms – Homemade Paneer\n" +
                    "-3 tbsps – All purpose flour\n" +
                    "-1/8 tspn – Baking soda (optional)\n" +
                    "-1 tbsp – Milk\n" +
                    "-Oil or Ghee  for deep frying\n\n" +
                    "Instructions:\n" +
                    "•In a Kadhai (wok) keep the water to boil.Once the water starts boiling, add sugar to it and stir it till it dissolves. Let it boil for 5 minutes.\n" +"\n" +
                    "•Add crushed cardamom and saffron to this and let it boil for 5 more minutes.\n" +"\n" +
                    "•Add lemon juice to avoid crystallisation of sugar and boil for another 5 minutes.\n" +"\n" +
                    "•Add rose water and boil for another 5 minutes. By now the syrup should be sticky but not one string consistency. It should be slightly thick and sticky. If not boil till it reaches the right consistency. Switch off the flame and cover the wok with a lid.\n" +"\n" +
                    "•To start making the jamuns ,take room temperature, soft Khova in a wide plate. Crumble it and knead it with the heel of your palm for 5 to 7 minutes till it is smooth.\n" +"\n" +
                    "•Add all purpose flour and baking soda and knead well again for a couple of minutes. Sprinkle milk evenly over mixture and mix it well.\n" +"\n" +
                    "•If required, add few more drops of milk and mix well. Mixture should be soft. If the mixture is too soft then add a little all purpose flour. \n" +"\n" +
                    "•Grease your palms with ghee and divide mixture into equal sized small portions using a measuring spoon . I use 1tsp. Do not make larger balls as its size will increase to almost double after deep frying and soaking in sugar syrup.\n" +"\n" +
                    "•Take each portion in between your palms and make a round shaped crack free ball from it. While rolling the ball press them against the palm and roll it. \n" +
                    "•Keep stirring the oil and moving the jamuns so they fry equally and brown evenly.\n" +"\n" +
                    "•Deep fry until they turn golden brown, it will take around 6-7 minutes.\n" +"\n" +
                    "•Transfer them onto a kitchen towel to remove excess oil and immediately add them to the warm syrup.\n" +"\n" +
                    "•Leave the jamuns in syrup for at least 2 hours before serving to allow it to absorb the syrup properly. You will notice their increase in size as syrup gets absorbed.  \n" +"\n" +
                    "•Garnish it with almonds or Pistachios and some dried rose petals. Serve hot or at room temperature. With Rabdi or with icecream.\n",
            "Ingredients:\n" +
                    "-½ cup unsalted butter (113g)\n" +
                    "-6 ounces bittersweet chocolate chopped (168g)\n" +
                    "-2 large eggs\n" +
                    "-2 large egg yolks\n" +
                    "-¼ cup granulated sugar (50g)\n" +
                    "-⅛ teaspoon salt\n" +
                    "-2 tablespoons all-purpose flour\n\n" +
                    "Instructions:\n" +
                    "•Preheat the oven to 450F. Butter and lightly flour 6 (4- to 5-ounce) ramekins and place them on a baking sheet.\n" +"\n" +
                    "•Combine the butter and chocolate in a double boiler and melt over low heat, stirring until smooth. Or, place the butter and chocolate in a microwave-safe bowl and microwave on high, stirring every 30-seconds until melted. Whisk together until smooth.\n" +"\n" +
                    "•In a large mixing bowl, combine the eggs, egg yolks, sugar, and salt. Beat on medium speed until thick and pale yellow. Fold the chocolate mixture and flour into the egg mixture until well combined. Divide the batter among the prepared ramekins.\n" +"\n" +
                    "•Bake for 6 to 8 minutes or until the sides of the cakes are firm set but the center is jiggly. Let the cakes cool in the ramekins for 1 minute.\n" +"\n" +
                    "•Place a small dessert plate over the top of each ramekin and carefully turn it over, inverting the cake onto the plate. Let stand for about 10 seconds, then remove the ramekin to unmold the cakes. Sift powdered sugar on top and garnish with berries, if desired. Serve immediately.\n"+"\n",
            "Ingredients:\n" +
                    "Mascarpone Cream\n" +
                    "-4 oz full fat mascarpone cheese (110 g)\n" +
                    "-2 tbsp granulated sugar (25 g)\n" +
                    "-1/2 tsp vanilla extract\n" +
                    "-1/2 cup whipping cream, min 35% fat (125 ml), chilled\n" +"\n"+

                    "Coffee Mixture\n" +
                    "-1/2 cup water (125 ml)\n" +
                    "-2 tbsp instant coffee\n" +
                    "-1 tbsp granulated sugar\n" +"\n"+

                    "Others\n" +
                    "-cocoa powder\n" +
                    "-ladyfinger biscuits\n\n" +
                    "Instructions:\n" +
                    "Mascarpone Cream\n" +
                    "•Add mascarpone cheese and sugar into a bowl. Whisk until fluffy using a handheld whisk. Now add in vanilla extract and whipping cream. Continue whisking until you get a thick stiff cream. Don't over mix to avoid splitting. Set aside.\n" +"\n"+

                    "Coffee Mixture\n" +
                    "•Mix water, coffee and sugar in a wide flat container until sugar is dissolved. Set aside.\n" +"\n"+

                    "Assembling\n" +
                    "•Soak ladyfingers in the coffee for a few seconds and arrange at the bottom of 2 glasses of 1 cup (250 ml). Dust with cocoa powder. Spoon and divide half of mascarpone mixture into the glasses. Repeat with more ladyfingers and the rest of the cream.\n" +
                    "•Serve directly. Optional - chill in the fridge for 1- 2 hours for a firmer texture. Dust the top with cocoa powder right before serving.\n"+"\n",
            "Ingredients:\n" +
                    "-4 teaspoons organic espresso powder\n" +
                    "-3 tablespoons almond butter\n" +
                    "-2 tablespoons raw cacao powder\n" +
                    "-2 tablespoons raw honey or any sweetener of your choice*\n" +
                    "-2/3 cup water\n" +
                    "-2 cups ice\n" +"\n" +

                    "Optional:\n" +
                    "-coconut cream ** or heavy cream\n" +
                    "-dark chocolate melted\n" +
                    "-homemade caramel sauce click for recipe\n\n" +
                    "Instructions\n" +
                    "•Add to a blender the espresso powder, almond butter, cacao powder, honey, followed by the water and ice.\n" +"\n" +
                    "•Blend for a few seconds until the ice is crushed and everything is combined.\n" +"\n" +
                    "•If desired, top your coffee with coconut whipped cream, melted chocolate, homemade caramel sauce and some cacao nibs.\n" +"\n",
            "Ingredients:\n" +
                    "-All-purpose flour\n" +
                    "-Old fashioned rolled oats\n" +
                    "-Baking powder\n" +
                    "-Butter\n" +
                    "-Light brown sugar and granulated sugar\n" +
                    "-Eggs\n" +
                    "-Vanilla\n\n" +

                    "Instructions:\n " +
                    "•Dark chocolate chips\n" +"\n" +
                    "•Once you mix up the dough for these chocolate chip cookie bars, throw them in the oven and bake for 21 to 23 minutes until golden brown. That’s it! It’s so much easier than cookies.\n"+"\n",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_recipe);
        tv = findViewById(R.id.textViewBKTitle);
        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);
        if (title.compareTo("Veg") == 0) {
            book_details = ve;
            //url=fic_url;
            books = ve_det;
            images=v_img;
        }else if (title.compareTo("NonVeg") == 0){
            book_details = nv;
            books = nv_det;
            images=nv_img;
        }
        else if (title.compareTo("Indian") == 0){
            book_details = ind;
            books = ind_det;
            images=ind_img;
        }
        else if (title.compareTo("Italian") == 0){
            book_details = ita;
            books = ita_det;
            images=ita_img;
        }
        else if (title.compareTo("Chinese") == 0){
            book_details = chi;
            books = chi_det;
            images=chi_img;
        }
        else {
            book_details = des;
            books = des_det;
            images=des_img;
        }
        list = new ArrayList();
        for (int i = 0; i < book_details.length; i++) {
            item = new HashMap<String, String>();
            item.put("images", images[i] + "");
            item.put("line1", book_details[i][0]);
            item.put("line2", book_details[i][1]);
            item.put("line3", book_details[i][2]);
            item.put("line4", book_details[i][3]);
            item.put("line5", book_details[i][4]);
            list.add(item);
        }
        sa = new SimpleAdapter(this, list,
                R.layout.multi_lines,
                new String[]{"images","line1", "line2", "line3", "line4", "line5"},
                new int[]{R.id.view,R.id.line_a, R.id.line_b, R.id.line_c, R.id.line_d, R.id.line_e}
        );
        ListView lst = findViewById(R.id.listViewBK);
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent it = new Intent(ViewRecipeActivity.this, RecipeDetails.class);
                it.putExtra("text1", book_details[position][0]);
                it.putExtra("text2", books[position]);
                it.putExtra("text3", books[position]);
                it.putExtra("text4", images[position]);
                startActivity(it);
            }
        });
    }
}