import com.pmtaller2.JuanPayes_00005923.data.Dish
import com.pmtaller2.JuanPayes_00005923.data.Restaurant

val restaurants = listOf(
    Restaurant(
        id = 1,
        name = "Pizza Planet",
        description = "Las mejores pizzas del universo",
        imageUrl = "https://cdn.create.vista.com/downloads/61b316d9-80ff-42c3-8a3b-a8ed0fa71509_640.jpeg",
        categories = listOf( "Comida Rápida", "Comida Italiana"),
        menu = listOf(
            Dish(1, "Pizza Pepperoni", "Clásica pizza con pepperoni y queso.", "https://www.sortirambnens.com/wp-content/uploads/2019/02/pizza-de-peperoni.jpg"),
            Dish(2, "Pizza Vegetariana", "Pizza saludable con verduras frescas.", "https://www.revistapancaliente.co/wp-content/uploads/2024/09/Pizza_vegetariana.jpg")
        )
    ),
    Restaurant(
        id = 2,
        name = "Burger King Kong",
        description = "Las hamburguesas más monstruosas",
        imageUrl = "https://www.shutterstock.com/image-vector/burger-king-kong-illustration-food-260nw-1605024511.jpg",
        categories = listOf("Comida Rápida"),
        menu = listOf(
            Dish(3, "Hamburguesa clasica", "Doble carne, doble queso, doble sabor.", "https://www.serargentino.com/public/images/2021/01/16109941330-17-burger-773x458.jpg"),
            Dish(4, "Hamburguesa pollo", "Una opción deliciosa y saludable.", "https://comedera.com/wp-content/uploads/sites/9/2023/07/Hamburguesa-de-pollo-picante.jpg")
        )
    ),
    Restaurant(
        id = 3,
        name = "China Wong",
        description = "Comida china, fideos y más en minutos",
        imageUrl = "https://i.pinimg.com/736x/13/8d/66/138d66de5ff5761bb7745ee7debe3217.jpg ",
        categories = listOf("Comida Rápida", "Comida Asiática"),
        menu = listOf(
            Dish(5, "Pollo teriyaki", "Pollo asado bañado en salsa teriyaki y arroz blanco.", "https://cdn.recetasderechupete.com/wp-content/uploads/2014/04/pollo_teriyaki.jpg"),
            Dish(6, "sopa de fideos", "Sopa clasica de fideos, vegetales y cerdo.", "https://img-global.cpcdn.com/recipes/510240c9f1f1e1fe/680x482cq70/sopa-china-de-cerdo-foto-principal.jpg")
        )
    ),

    Restaurant(
        id = 4,
        name = "La cantinflada",
        description = "Tacos locamente buenos",
        imageUrl = "https://images.vexels.com/media/users/3/78219/raw/dcab1e681faf8533c20bd8fb289b0d0a-logo-de-comida-mexicana-con-cactus.jpg",
        categories = listOf("Comida Mexicana"),
        menu = listOf(
            Dish(7, "Taco Pastor", "Taco clásico de cerdo marinado.", "https://www.aceitegrantradicion.com/wp-content/uploads/tacos-al-pastor.jpg"),
            Dish(8, "Taco de chucho", "Combinación de chorizo y bistec.", "https://guerrerotortillas.com/wp-content/uploads/2021/04/pork-tenderloin-tacos.jpg   ")
        )
    ),
    Restaurant(
        id = 5,
        name = "Taco hermanos",
        description = "Burritos del tamaño de tus sueños",
        imageUrl = "https://i.pinimg.com/736x/11/c6/1e/11c61eb419f2d1fac6ebb1d19a448b05.jpg",
        categories = listOf("Comida Mexicana"),
        menu = listOf(
            Dish(9, "Burrito Supremo", "Burrito gigante con todo.", "https://www.recetasnestlecam.com/sites/default/files/2022-07/recetas-burritos-huevo.jpg_3.jpg"),
            Dish(10, "Burrito de res", "Sin carne pero con mucho sabor.", "https://thefamilydinnerproject.org/wp-content/uploads/2017/08/beef-and-bean-burrito-closeup-1-resized-633x326.jpg")
        )
    ),
    Restaurant(
        id = 6,
        name = "Nacho libre",
        description = "Donde los nachos son reyes",
        imageUrl = "https://i.pinimg.com/736x/db/bc/e0/dbbce05f8a8cfc1897759d01c4f45314.jpg",
        categories = listOf("Comida Mexicana"),
        menu = listOf(
            Dish(11, "Nachos con Guacamole", "Totopos crujientes con guac fresco.", "https://cdn.elcocinerocasero.com/imagen/paso-receta/1000/2016-03-10-11-09-32/nachos-con-queso-y-carne-paso-4.jpeg"),
            Dish(12, "Nachos con Carne", "Totopos con carne, queso y frijoles.", "https://cdn6.recetasdeescandalo.com/wp-content/uploads/2020/03/Nachos-con-queso-guacamole-y-chili-con-carne-al-horno.jpg")
        )
    ),

    Restaurant(
        id = 7,
        name = "Trattoria Bella",
        description = "Tradición italiana en cada bocado",
        imageUrl = "https://i.pinimg.com/736x/67/85/74/678574c74c2fd877e31ec572f8edff57.jpg",
        categories = listOf("Comida Italiana"),
        menu = listOf(
            Dish(13, "Lasagna Clásica", "Capas de pasta, carne y queso.", "https://www.recetasnestle.cl/sites/default/files/srh_recipes/57d2453074b608263f3a814302cc7864.jpg"),
            Dish(14, "Pasta Alfredo", "Pasta con salsa cremosa de queso.", "https://www.recetasnestle.com.ec/sites/default/files/srh_recipes/6594a07290c4cc5ed88f682560cc2e49.jpg")
        )
    ),
    Restaurant(
        id = 8,
        name = "Pasta e Basta",
        description = "¡Solo pasta, y basta!",
        imageUrl = "https://marketplace.canva.com/EAE8A6RzQzk/1/0/1600w/canva-logo-mantel-rojo-cocina-italiana-restaurante-ZLsYrLpp6xU.jpg",
        categories = listOf("Comida Italiana"),
        menu = listOf(
            Dish(15, "Espagueti a la Boloñesa", "Pasta con salsa de carne.", "https://www.recetasnestle.com.do/sites/default/files/srh_recipes/465ffb6f3bb041a97de9834892f58c1e.jpg"),
            Dish(16, "Ravioles de Ricotta", "Rellenos suaves con salsa de tomate.", "https://www.cocinadelirante.com/800x600/filters:format(webp):quality(75)/sites/default/files/images/2024/12/como-hacer-1-kilo-de-espagueti-blanco-cremoso.jpg")
        )
    ),

    Restaurant(
        id = 10,
        name = "GreenGo",
        description = "Comida que tu cuerpo ama",
        imageUrl = "https://www.shutterstock.com/image-vector/vegetable-salad-logo-design-bar-260nw-1185069109.jpg",
        categories = listOf("Comida Saludable"),
        menu = listOf(
            Dish(19, "Bowl de Quinoa", "Con aguacate, tomate y garbanzos.", "https://cdn.recetasderechupete.com/wp-content/uploads/2020/09/quinoa-cocida.jpg"),
            Dish(20, "Ensalada Detox", "Hojas verdes, zanahoria y más.", "https://www.laespanolaaceites.com/wp-content/uploads/2019/05/ensalada-de-pasta-con-rosbif-de-atun.jpg")
        )
    ),
    Restaurant(
        id = 11,
        name = "Bar Salad",
        description = "Saludable y sabroso",
        imageUrl = "https://st3.depositphotos.com/7069750/14670/v/450/depositphotos_146709267-stock-illustration-vector-logo-template-salad-bar.jpg",
        categories = listOf("Comida Saludable"),
        menu = listOf(
            Dish(21, "Wrap Integral", "Pollo a la plancha con vegetales.", "https://imag.bonviveur.com/presentacion-principal-del-wrap-de-pollo-y-verduras.jpg"),
            Dish(22, "Smoothie Verde", "Con espinaca, piña y jengibre.", "https://www.vitamixespana.com/recetas/wp-content/uploads/2018/04/smoothie-verde-vitamix.jpg")
        )
    ),
    Restaurant(
        id = 12,
        name = "Nature’s Bite",
        description = "Delicias naturales para el alma",
        imageUrl = "https://i.pinimg.com/736x/fc/a4/85/fca48567ec6ebcc4367b8ab1ff73d291.jpg",
        categories = listOf("Comida Saludable"),
        menu = listOf(
            Dish(23, "Tofu Bowl", "Tofu marinado con arroz integral.", "https://i.blogs.es/a3b59e/tofu-min/450_1000.jpg"),
            Dish(24, "Ensalada de Frutas", "Mezcla de frutas frescas de temporada.", "https://www.bancodealimentoschicago.org/wp-content/uploads/2022/04/Fruit-Salad.jpg")
        )
    ),

    Restaurant(
        id = 13,
        name = "CandyShop",
        description = "Dulces que te alegran el día",
        imageUrl = "https://i.pinimg.com/originals/a3/86/2e/a3862e78b02c0dd56965b330505cfb3d.png",
        categories = listOf("Postres"),
        menu = listOf(
            Dish(25, "Cupcake de Vainilla", "Con cobertura de buttercream.", "https://www.recetaslider.cl/wp-content/uploads/2021/06/principal_5d3eee5723503.jpg"),
            Dish(26, "Galletas con Chispas", "Recién horneadas y suaves.", "https://i.pinimg.com/736x/72/74/5f/72745fbe3433259613c1b3e86725df54.jpg")
        )
    ),
    Restaurant(
        id = 14,
        name = "Boston",
        description = "Helados para todos los gustos",
        imageUrl = "https://www.plazamerliot.com.sv/wp-content/uploads/2019/11/boston.png",
        categories = listOf("Postres"),
        menu = listOf(
            Dish(27, "Helado de Chocolate", "Cremoso y lleno de sabor.", "https://www.recetasnestlecam.com/sites/default/files/srh_recipes/9cf46987682bc00252bf01c7482452f8.jpg"),
            Dish(28, "Helado de frutas", "Sin leche pero delicioso.", "https://campograndeperu.com/wp-content/uploads/2024/03/helado-de-naranja-3-compressed-edited.jpg")
        )
    ),
    Restaurant(
        id = 15,
        name = "Churros Churros",
        description = "Churros rellenos de felicidad",
        imageUrl = "https://i.pinimg.com/originals/6e/28/e2/6e28e2a6a9ae241c3dbd7f13ba820283.jpg",
        categories = listOf("Postres"),
        menu = listOf(
            Dish(29, "Churros con Dulce de Leche", "Recién hechos y rellenos.", "https://tucoweb.info/wp-content/uploads/2021/05/Churros-7.jpg"),
            Dish(30, "Churros de Chocolate", "Cubiertos con chocolate derretido.", "https://thescranline.com/wp-content/uploads/2023/09/CHURROS-S-01.jpg")
        )
    ),

    Restaurant(
        id = 16,
        name = "Bebidas express",
        description = "Refrescos naturales y saludables",
        imageUrl = "https://i.pinimg.com/736x/be/e7/49/bee749425ec4c163110eaf6f1ee8f9ec.jpg",
        categories = listOf("Bebidas"),
        menu = listOf(
            Dish(31, "Limonada de Hierbabuena", "Refrescante y natural.", "https://www.infobae.com/new-resizer/DC_o9a_WWeEuFAhjL1am0SpifwA=/arc-anglerfish-arc2-prod-infobae/public/CLWWVAIRGJF4FG4ATXCV7YZZLQ.jpg"),
            Dish(32, "Agua de Coco", "Directo del coco, sin azúcar.", "https://www.finedininglovers.com/es/sites/g/files/xknfdk1706/files/2022-07/agua-de-coco-origen%C2%A9iStock.jpg")
        )
    ),
    Restaurant(
        id = 17,
        name = "Café Central",
        description = "Pasión por el buen café",
        imageUrl = "https://us.123rf.com/450wm/morys/morys1503/morys150300011/37926803-cafeter%C3%ADa-plantilla-de-dise%C3%B1o-del-logotipo-emblema-caf%C3%A9-retro-vector-el-arte.jpg",
        categories = listOf("Bebidas"),
        menu = listOf(
            Dish(33, "Espresso", "Intenso y aromático.", "https://cdn.recetasderechupete.com/wp-content/uploads/2022/01/Expresso-macchiato.jpg"),
            Dish(34, "Latte con Arte", "Café con leche decorado a mano.", "https://www.caffesociety.co.uk/assets/recipe-images/latte-small.jpg")
        )
    ),
    Restaurant(
        id = 19,
        name = "Sushi Nation",
        description = "Auténtico sushi japonés con ingredientes frescos.",
        imageUrl = "https://st2.depositphotos.com/4191945/7462/v/450/depositphotos_74627145-stock-illustration-vector-sushi-logo-or-icon.jpg",
        categories = listOf("Comida Asiática"),
        menu = listOf(
            Dish(
                id = 37,
                name = "Sushi de Salmón",
                description = "Delicioso sushi con salmón fresco y arroz sazonado.",
                imageUrl = "https://img-global.cpcdn.com/recipes/f5dfaf27934979f7/400x400cq70/photo.jpg"
            ),
            Dish(
                id = 38,
                name = "Roll California",
                description = "Aguacate, cangrejo y pepino envueltos en arroz y alga.",
                imageUrl = "https://norecipes.com/wp-content/uploads/2019/12/best-california-roll-004.jpg"
            )
        )
    ),
    Restaurant(
        id = 20,
        name = "Ramen Dojo",
        description = "Sopas ramen tradicionales con caldo casero.",
        imageUrl = "https://i.pinimg.com/736x/2c/a9/cb/2ca9cb97e6bcd27566782059ae8df4ab.jpg",
        categories = listOf("Comida Asiática"),
        menu = listOf(
            Dish(
                id = 39,
                name = "Ramen kosuko",
                description = "Caldo de cerdo cocinado por 12 horas con fideos frescos.",
                imageUrl = "https://media.foodspring.com/magazine/public/uploads/2022/03/March-2022-foodspring-205-1195x759.jpg"
            ),
            Dish(
                id = 40,
                name = "Ramen volado",
                description = "Ramen con caldo de miso y vegetales frescos.",
                imageUrl = "https://www.orientalmarket.es/wp-content/uploads/2016/07/ramen.jpeg"
            )
        )
    )
)
