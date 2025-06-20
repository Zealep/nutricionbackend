-- Inserción de datos de alergias comunes
INSERT INTO alergias (descripcion, activo) VALUES
                                               ('Gluten (celiaquía o sensibilidad al gluten)', TRUE),
                                               ('Lactosa (intolerancia a la lactosa)', TRUE),
                                               ('Proteína de la leche de vaca (alergia)', TRUE),
                                               ('Maní (cacahuate)', TRUE),
                                               ('Frutos secos (nueces, almendras, avellanas, etc.)', TRUE),
                                               ('Huevo', TRUE),
                                               ('Mariscos (camarones, langostinos, cangrejo)', TRUE),
                                               ('Pescado', TRUE),
                                               ('Soya (soja)', TRUE),
                                               ('Trigo', TRUE),
                                               ('Sésamo (ajonjolí)', TRUE),
                                               ('Mostaza', TRUE),
                                               ('Apio', TRUE),
                                               ('Sulfitos (presentes en alimentos procesados y vinos)', TRUE),
                                               ('Colorantes artificiales', TRUE),
                                               ('Aditivos alimentarios (glutamato monosódico, benzoatos, etc.)', TRUE),
                                               ('Chocolate', TRUE),
                                               ('Frutas cítricas (naranja, mandarina, limón)', TRUE),
                                               ('Tomate', TRUE),
                                               ('Fresas (frutilla)', TRUE);


-- Inserción de datos de medicamentos comunes
INSERT INTO medicamentos (descripcion, activo) VALUES
                                                   ('Metformina', TRUE), -- diabetes tipo 2
                                                   ('Insulina', TRUE), -- diabetes tipo 1 y 2
                                                   ('Levotiroxina', TRUE), -- hipotiroidismo
                                                   ('Omeprazol', TRUE), -- inhibidor de bomba de protones
                                                   ('Atorvastatina', TRUE), -- colesterol alto
                                                   ('Simvastatina', TRUE),
                                                   ('Lactulosa', TRUE), -- estreñimiento
                                                   ('Hierro (sulfato ferroso)', TRUE), -- anemia
                                                   ('Ácido fólico', TRUE),
                                                   ('Vitamina B12 (cianocobalamina)', TRUE),
                                                   ('Vitamina D', TRUE),
                                                   ('Multivitamínico', TRUE),
                                                   ('Calcio con vitamina D', TRUE),
                                                   ('Probioticos', TRUE),
                                                   ('Furosemida', TRUE), -- diurético
                                                   ('Enalapril', TRUE), -- hipertensión
                                                   ('Losartán', TRUE),
                                                   ('Insulina glargina', TRUE),
                                                   ('Insulina rápida (lispro, aspart)', TRUE),
                                                   ('Prednisona', TRUE), -- corticoide
                                                   ('Dexametasona', TRUE),
                                                   ('Cloruro de potasio', TRUE),
                                                   ('Magnesio (óxido o citrato)', TRUE),
                                                   ('Suplemento proteico (whey protein)', TRUE),
                                                   ('Suplemento de omega-3', TRUE),
                                                   ('Orlistat', TRUE); -- pérdida de peso

-- Datos base de patologías relacionadas con nutrición
INSERT INTO patologias (descripcion, activo) VALUES
                                                 ('Diabetes tipo 1', TRUE),
                                                 ('Diabetes tipo 2', TRUE),
                                                 ('Hipertensión arterial', TRUE),
                                                 ('Dislipidemia (colesterol y triglicéridos altos)', TRUE),
                                                 ('Obesidad', TRUE),
                                                 ('Sobrepeso', TRUE),
                                                 ('Desnutrición', TRUE),
                                                 ('Síndrome metabólico', TRUE),
                                                 ('Hipotiroidismo', TRUE),
                                                 ('Hipertiroidismo', TRUE),
                                                 ('Enfermedad celíaca', TRUE),
                                                 ('Intolerancia a la lactosa', TRUE),
                                                 ('Insuficiencia renal crónica', TRUE),
                                                 ('Hígado graso (esteatosis hepática)', TRUE),
                                                 ('Cirrosis hepática', TRUE),
                                                 ('Gastritis', TRUE),
                                                 ('Reflujo gastroesofágico (ERGE)', TRUE),
                                                 ('Estreñimiento crónico', TRUE),
                                                 ('Síndrome de intestino irritable (SII)', TRUE),
                                                 ('Anemia ferropénica', TRUE),
                                                 ('Anemia megaloblástica', TRUE),
                                                 ('Osteoporosis', TRUE),
                                                 ('Enfermedad inflamatoria intestinal (Crohn, colitis ulcerosa)', TRUE),
                                                 ('Cáncer', TRUE),
                                                 ('Trastornos de la conducta alimentaria (anorexia, bulimia, TCANE)', TRUE),
                                                 ('Insuficiencia cardíaca', TRUE),
                                                 ('Enfermedad coronaria', TRUE),
                                                 ('COVID-19 post-agudo (síndrome post-COVID)', TRUE),
                                                 ('Alergias alimentarias', TRUE);


-- Tiempos de comida estándar
INSERT INTO tiempo_comida (nombre, activo) VALUES
                                               ('Desayuno', TRUE),
                                               ('Media mañana', TRUE),
                                               ('Almuerzo', TRUE),
                                               ('Merienda', TRUE),
                                               ('Cena', TRUE),
                                               ('Refrigerio nocturno', TRUE),
                                               ('Pre-entrenamiento', TRUE),
                                               ('Post-entrenamiento', TRUE);


INSERT INTO objetivo (nombre, descripcion, calorias, porcentaje_carbohidratos, porcentaje_proteinas, porcentaje_grasas,activo)
VALUES
    ('Bajar de peso', 'Reducción de grasa corporal', -500, 50, 25, 25,TRUE),
    ('Subir de peso', 'Aumento de masa corporal general', 500, 55, 20, 25,TRUE),
    ('Ganar masa muscular', 'Incremento de masa magra', 700, 45, 30, 25,TRUE),
    ('Mantener peso', 'Estabilizar peso corporal actual', 0, 50, 20, 30,TRUE);