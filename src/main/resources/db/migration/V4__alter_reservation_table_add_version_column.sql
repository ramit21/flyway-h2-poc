ALTER TABLE RESERVATION ADD COLUMN version INT;

UPDATE RESERVATION SET VERSION = 0; --version column must be intialised with 0, leaving it null will cause NPE when updating the row