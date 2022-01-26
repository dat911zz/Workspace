var inputs = document.getElementsByClassName("modal-input");
var header = document.getElementById('header');
var mobileMenu = document.getElementById('mobile-menu');

const buyBtns = document.querySelectorAll('.js-buy-ticket')
const modal = document.querySelector('.js-modal')
const modalForm = document.querySelector('.js-form1')
const modalClose = document.querySelector('.js-modal-close')
const modalContainer = document.querySelector('.js-modal-container')

const modalInput = document.querySelector('.modal-input')
const modalDoneContainer = document.querySelector('.js-modal-done-container')
const modalBuyBtn = document.querySelector('.js-modal-buy-btn')
const modalDone = document.querySelector('.js-modal-done')
const modalDoneClose = document.querySelector('.js-close-btn')

// Show modal
function showBuyTickets() {
    modal.classList.add('open')
}
// Hide modal
function hideBuyTickets() {
    modal.classList.remove('open')
}
// Show SucceededModal
function showComplete() {
    //hideBuyTickets()
    modalDone.classList.add('open')
}
// Hide SucceededModal
function hideComplete() {
    modalDone.classList.remove('open')
    modal.classList.remove('open')
}

// Lặp qua từng thẻ btn và nghe hành vi click
for (const buyBtn of buyBtns) {
    buyBtn.addEventListener('click', showBuyTickets)
}

function isEmpty(str) {
    return !str.trim().length;
}


// Ngăn không cho người dùng bấm nút mua khi chưa nhập đầy đủ thông tin
modal.addEventListener("submit", function(e) { // event into anonymous function
    let ver = true;
    e.preventDefault(); //Prevent submit event from refreshing the page

    for (let i = 0; i < inputs.length; i++)
        if (inputs[i].value == "") {
            // alert("empty");
            ver = false;
        }

    if (!ver) {
        return false;
    } else {
        // alert("Ok!");
        showComplete();
    }
})
// Nghe hành vi click vào btn close
modalClose.addEventListener('click', hideBuyTickets)
modal.addEventListener('click', hideBuyTickets)

// Nghe hành vi click vào Close Btn của DoneModal
modalDoneClose.addEventListener('click', hideComplete)

// Viết truyền thẳng hàm vào luôn
modalContainer.addEventListener('click', function(event) {
    event.stopImmediatePropagation() //Chống nổi bọt ( để ngăn chặn việc bấm vào các thành phần con thì bị thoát)
})
modalDoneContainer.addEventListener('click', function(event) {
    event.stopImmediatePropagation()
})

// ====================================================
// Responsive


// Đóng/mở mobile menu
mobileMenu.onclick = function(){
    // alert("Damn boiz!");
    console.log(header.clientHeight);

    var isClose = header.clientHeight === 46;
    if(isClose){
        header.style.height = 'auto';
    }
    else{
        header.style.height = null;
    }
}

// Tự động đóng khi chọn menu
var menuItems = document.querySelectorAll('#nav li a[href*="#"]');
console.log(menuItems);


for(var i = 0; i < menuItems.length; i++){
    var menuItem = menuItems[i];
    // console.log(menuItem);

    menuItem.onclick = function () {
        console.log(this);
        header.style.height = null;
    }
}