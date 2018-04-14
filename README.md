# ProxyLibrary

1.  在project的根目录下添加JitPack的maven 依赖

  allprojects {
  
    repositories {    
    
        maven { url 'https://jitpack.io' }
	
	
    }
    
}

2.然后再app的目录下进行引用

dependencies {


		compile 'com.github.xiao125:ProxyLibrary:v0.1.1'
		
		
		
	}
