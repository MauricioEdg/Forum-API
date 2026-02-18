ALTER TABLE usuario
ADD COLUMN perfil_id BIGINT;

ALTER TABLE usuario
ADD CONSTRAINT fk_usuario_perfil
FOREIGN KEY (perfil_id)
REFERENCES perfil(id);