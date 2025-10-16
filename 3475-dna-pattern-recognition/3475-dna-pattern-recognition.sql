# Write your MySQL query statement below
SELECT *, (CASE WHEN dna_sequence  REGEXP "^ATG" THEN 1 ELSE 0 END) as has_start,
(CASE WHEN dna_sequence  REGEXP "TAA$"  THEN 1 WHEN dna_sequence  REGEXP "TAG$"  THEN 1 
WHEN dna_sequence  REGEXP "TGA$" THEN 1 ELSE 0 END) as has_stop,
(CASE WHEN dna_sequence  REGEXP "ATAT" THEN 1 ELSE 0 END) as has_atat,
(CASE WHEN dna_sequence  REGEXP "GGG" THEN 1 ELSE 0 END) as has_ggg
FROM Samples
