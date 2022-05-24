var menus = document.querySelectorAll(".menu--item");
var items = document.querySelectorAll(".info--item");

menus.forEach( (menu, index) => {
    const item = items[index];
    menu.addEventListener("click", () => {
        document.querySelector(".menu--item.active--menu").classList.remove("active--menu");
        document.querySelector(".info--item.active--item").classList.remove("active--item");

        menu.classList.add("active--menu");
        item.classList.add("active--item");
    });

})