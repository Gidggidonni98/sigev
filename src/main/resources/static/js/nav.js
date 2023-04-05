var btnSide = document.querySelector("#btnSide");
var sideBar = document.querySelector("#sidebar-container");

btnSide.addEventListener("click", function () {
  if (sideBar.classList.contains("sidebar-inactivate")) {
    sideBar.classList.remove("sidebar-inactivate");
  } else {
    sideBar.classList.add("sidebar-inactivate");
  }
});
