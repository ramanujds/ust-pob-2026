function readInput(event) {
    event?.preventDefault();
    const name=document.getElementById('name').value;
    const price=document.getElementById('price').value;
    const category=document.getElementById('category').value;
    const product = {name,price,category};
    if(!validateProduct(product)) {
        return;
    }
    addProduct(product);
}

const validateProduct = (product) => {
    if(!product.name || product.name.trim() === '') {
        alert('Product name is required');
        return false;
    }
    if(!product.price || isNaN(product.price) || product.price <= 0) {
        alert('Valid product price is required');
        return false;
    }
    if(!product.category || product.category.trim() === '') {
        alert('Product category is required');
        return false;
    }
    return true;
}

function addProduct(product) {
    const url = 'http://localhost:8000/api/v1/products';
    fetch(url, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(product)
    }).then(response => response.json())
    .then(data => {
        console.log('Success:', data);
        fetchProducts();
    })
    .catch((error) => {
        console.error('Error:', error);
    });
}

const fetchProducts = () => {
    const url = 'http://localhost:8000/api/v1/products';
    fetch(url)
    .then(response => response.json())
    .then(data => {
        console.log('Products:', data);
        loadProductCards(data);
    })
    .catch((error) => {
        console.error('Error:', error);
    });
}

const loadProductCards = (products) => {
    const productListDiv = document.getElementById('product-list');
    productListDiv.innerHTML = ''; 
    products.forEach(product => {
        const productCard = document.createElement('div');
        productCard.className = 'card mb-3';
        productCard.innerHTML = `
            <div class="card-body">
                <h5 class="card-title">${product.name}</h5>
                <p class="card-text">Price: ₹${product.price}</p>
                <p class="card-text">Category: ${product.category}</p>
                <button class="btn btn-danger" onclick="deleteProduct(${product.id})">Delete</button>
            </div>
        `;
        productListDiv.appendChild(productCard);    
    }
    );
}

const deleteProduct = id => {
    if(confirm("Want to delete Product : "+id+"?")){
    const url = 'http://localhost:8000/api/v1/products/'+id;
    fetch(url, {
        method: 'DELETE'
    }).then(data => {
        alert("Deleted Product with Id : "+id)
        fetchProducts();
    })
    .catch((error) => {
        console.error('Error:', error);
    });
    
    }
}