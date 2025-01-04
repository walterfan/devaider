CREATE TABLE Prompt (
    id CHAR(36) PRIMARY KEY, -- UUID stored as a string
    name VARCHAR(255) NOT NULL,
    description TEXT,
    system_prompt TEXT,
    user_prompt TEXT,
    additional_prompt TEXT
);

CREATE TABLE Tag (
    id CHAR(36) PRIMARY KEY, -- UUID
    name VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE Prompt_Tag (
    prompt_id CHAR(36) NOT NULL,
    tag_id CHAR(36) NOT NULL,
    PRIMARY KEY (prompt_id, tag_id),
    FOREIGN KEY (prompt_id) REFERENCES Prompt(id) ON DELETE CASCADE,
    FOREIGN KEY (tag_id) REFERENCES Tag(id) ON DELETE CASCADE
);

CREATE TABLE Variable (
    id CHAR(36) PRIMARY KEY, -- UUID
    prompt_id CHAR(36) NOT NULL,
    variable_key VARCHAR(255) NOT NULL,
    variable_value TEXT,
    UNIQUE (prompt_id, variable_key),
    FOREIGN KEY (prompt_id) REFERENCES Prompt(id) ON DELETE CASCADE
);