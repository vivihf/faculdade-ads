CREATE DATABASE Faculdade;

USE Faculdade;

CREATE TABLE Aluno (
	IdAluno INT NOT NULL,
	matricula varchar(10),
	nome varchar(50),
    PRIMARY KEY(IdAluno)
);

CREATE TABLE Disciplina (
	IdDisciplina INT NOT NULL,
	nome varchar(50),
    cargaHoraria INT,
    PRIMARY KEY(IdDisciplina)
);

CREATE TABLE Curso (
	IdCurso INT NOT NULL,
    nome varchar(50),
    PRIMARY KEY(IdCurso)
);

CREATE TABLE Historico (
	IdAluno INT NOT NULL,
    IdDisciplina INT NOT NULL,
    nota FLOAT,
    dataHistorico DATE,
    FOREIGN KEY(IdAluno) REFERENCES Aluno(IdAluno) ON DELETE NO ACTION ON UPDATE NO ACTION,
    FOREIGN KEY(IdDisciplina) REFERENCES Disciplina(IdDisciplina) ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE AlunoCurso (
	IdAluno INT NOT NULL,
    IdCurso INT NOT NULL,
    AnoEntrada INT NOT NULL,
    FOREIGN KEY(IdAluno) REFERENCES Aluno(IdAluno) ON DELETE NO ACTION ON UPDATE NO ACTION,
    FOREIGN KEY(IdCurso) REFERENCES Curso(IdCurso) ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE Grade (
	IdGrade INT NOT NULL,
    IdCurso INT NOT NULL,
    ano INT NOT NULL,
    cargaHorariaTotal INT NOT NULL,
    PRIMARY KEY(IdGrade),
    FOREIGN KEY(IdCurso) REFERENCES Curso(IdCurso) ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE GradeDisciplina (
	IdGrade INT NOT NULL,
    IdDisciplina INT NOT NULL,
    FOREIGN KEY(IdGrade) REFERENCES Grade(IdGrade) ON DELETE NO ACTION ON UPDATE NO ACTION,
    FOREIGN KEY(IdDisciplina) REFERENCES Disciplina(IdDisciplina) ON DELETE NO ACTION ON UPDATE NO ACTION
);