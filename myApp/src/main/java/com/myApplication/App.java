
package com.myApplication;



import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * @goal lifecycleloader 
 * @execute lifecycle="customlifecycle" phase="compile"
 */
public class App extends AbstractMojo {

   public void execute() 
      throws MojoExecutionException, MojoFailureException {
	   getLog().info( "will not compile" );
   }

}

