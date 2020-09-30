-- Ejercicio 1:
---- 1. Mostrar los nombres de los empleados ordenados alfabéticamente
SELECT nombre
FROM empleado
ORDER BY nombre;

---- 2. Seleccionar el nombre, el oficio y la localizacion de los departamentos donde trabajan los vendedores
SELECT nombre, oficio, localizacion
FROM empleado
INNER JOIN departamento ON empleado.depto_no = departamento.depto_no
WHERE oficio = 'Vendedor';

---- 3. Listar los nombres de los empleados cuyo nombre termine con la letra ‘o’
SELECT nombre
FROM empleado
WHERE nombre LIKE '%o';

---- 4. Visualizar los departamentos con más de 2 empleados
SELECT nombre_depto, COUNT(1) AS cantidad_empleados
FROM empleado
INNER JOIN departamento ON empleado.depto_no = departamento.depto_no
GROUP BY departamento.depto_no
HAVING COUNT(1) >= 2;

---- 5. Mostrar el nombre, salario y nombre del departamento de los empleados que tengan el mismo oficio que "Castillo Montes Luis" y que no tengan comisión
SELECT oficio
FROM empleado
WHERE nombre = 'Castillo Montes Luis';

SELECT nombre, salario, nombre_depto
FROM empleado
INNER JOIN departamento ON empleado.depto_no = departamento.depto_no
WHERE oficio = 'Vendedor'
AND comision = 0;

SELECT nombre, salario, nombre_depto
FROM empleado
INNER JOIN departamento ON empleado.depto_no = departamento.depto_no
WHERE oficio = (
	SELECT oficio
	FROM empleado
	WHERE nombre = 'Castillo Montes Luis'
)
AND comision = 0;
---- 6. Mostrar los datos de los empleados que trabajan en el departamento de contabilidad, ordenados por nombre
-- se asume que depto_no = 30 para contabilidad, esto no debería cambiar
SELECT *
FROM empleado
WHERE depto_no = 30
ORDER BY nombre;

---- 7. Muestre el nombre de los empleados que trabajan en Leon y que tengan como oficio Analista o Empleado
SELECT nombre
FROM empleado
WHERE dir = 'Leon'
AND ( oficio = 'Analista' OR oficio = 'Empleado' );

---- 8. Cuantos empleados hay en el departamento “ventas”
-- se asume que depto_no = 40 para ventas, esto no debería cambiar
SELECT COUNT(1) AS cantidad_empleados
FROM empleado
WHERE depto_no = 40;

---- 9. Calcula el número de empleados que no tienen comisión
SELECT COUNT(1) AS empleados_sin_comision
FROM empleado
WHERE comision = 0;

---- 10. Mostrar cuántos nombres de los empleados empiezan con la letra “E”
SELECT COUNT(1) as CANTIDAD
FROM empleado
WHERE nombre LIKE 'E%';

---- 11. Cuantos empleados hay por cada departamento, indique nombre del departamento y la cantidad de empleados de cada uno
SELECT nombre_depto, COUNT(1) AS cantidad_empleados
FROM empleado
INNER JOIN departamento ON empleado.depto_no = departamento.depto_no
GROUP BY departamento.depto_no;
