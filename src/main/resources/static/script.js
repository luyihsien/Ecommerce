document.addEventListener("DOMContentLoaded", function() {
const productData = [
{
id: 1,
name: "Product 1",
price: 49.99,
image: "https://via.placeholder.com/150"
},
{
id: 2,
name: "Product 2",
price: 59.99,
image: "https://via.placeholder.com/150"
}
// Add more products here
];

const productGrid = document.querySelector(".product-grid");

productData.forEach(product => {
const productCard = document.createElement("div");
productCard.classList.add("product-card");
productCard.innerHTML = `
<img src="${product.image}" alt="${product.name}">
<h3>${product.name}</h3>
<p>$${product.price.toFixed(2)}</p>
<button>Add to Cart</button>
`;
productGrid.appendChild(productCard);
});
});
