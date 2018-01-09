Sys.setenv(SPARK_HOME = '/home/rajat/appDir/spark-2.2.1')
library(SparkR,lib.loc  = c(file.path(Sys.getenv("SPARK_HOME"),"R","lib")))
sc <- sparkR.session(master = "local[*]", sparkEnvir = list(spark.driver.memory="2g"))

sqlctx <- sparkR.session(sc)
dataframe <- createDataFrame(list(1,1,2,3,4,5))

createOrReplaceTempView(dataframe,"faith")

res <- sql("select * from faith")

print(res)
