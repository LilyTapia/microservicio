# 🛒 Microservicio - Tienda de Productos Comestibles

Este proyecto implementa un microservicio en Java Spring Boot para gestionar ventas, productos y generar boletas de compra, como parte de una arquitectura basada en servicios desplegada en la nube.

---

## 🚀 Características

- 🔍 Endpoint para listar productos disponibles.
- ➕ Endpoint para agregar nuevos productos.
- 🛒 Endpoint de carrito de compras que genera una boleta detallada.
- 💾 Persistencia en base de datos Oracle Cloud.
- 📦 Empaquetado como imagen Docker y desplegado en AWS EC2.

---

## 🧱 Tecnologías utilizadas

- ✅ Java 17
- ✅ Spring Boot 3.x
- ✅ Maven
- ✅ Oracle Cloud (Base de Datos)
- ✅ Docker + Docker Hub
- ✅ AWS EC2 (Despliegue)

---

## 📡 Endpoints principales

| Método | Endpoint                        | Descripción                           |
|--------|----------------------------------|---------------------------------------|
| GET    | `/productos`                    | Lista todos los productos             |
| POST   | `/productos`                    | Crea un nuevo producto                |
| POST   | `/compras`                      | Genera boleta desde carrito de compras |
| GET    | `/boletas/{id}`                 | Muestra detalle de una boleta         |

---

## ⚙️ Instrucciones para desarrollo local

### 1. Clonar el repositorio

```bash
git clone https://github.com/LilyTapia/microservicio.git
cd microservicio
