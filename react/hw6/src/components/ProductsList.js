import React, { useState } from "react";
import { useSelector, useDispatch } from "react-redux";
import { deleteProduct, toggleAvailability } from "./productsSlice";
import { EditProductForm } from "./EditProductForm";
import "./products.css";

export function ProductsList() {
    const products = useSelector((state) => state.products.products);
    const dispatch = useDispatch();
    const [editingProductId, setEditingProductId] = useState(null);
  
    const handleEditClick = (productId) => {
      setEditingProductId(productId);
    };
  
    const handleCloseEditForm = () => {
      setEditingProductId(null);
    };
  
    return (
      <div>
        {editingProductId && (
          <EditProductForm
            productId={editingProductId}
            onClose={handleCloseEditForm}
          />
        )}
        <ul className="product-list">
          {products.map((product) => (
            <li key={product.id} className="product-item">
              <div>
                {product.name} - {product.description} - {product.price} - руб. {" "}
                {product.available ? "в наличии" : "отсутствует"}
              </div>
              <div className="product-actions">
                <button
                  className="button"
                  onClick={() => dispatch(toggleAvailability(product.id))}
                >
                   переключение
                </button>
                <button
                  className="button"
                  onClick={() => handleEditClick(product.id)}
                >
                  Редактировать
                </button>
                <button
                  className="button"
                  onClick={() => dispatch(deleteProduct(product.id))}
                >
                  удалить
                </button>
              </div>
            </li>
          ))}
        </ul>
      </div>
    );
  }