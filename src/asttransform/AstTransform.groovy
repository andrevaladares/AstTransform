package asttransform

import groovy.transform.TimedInterrupt

import java.util.concurrent.TimeUnit

@TimedInterrupt(value = 60L, unit = TimeUnit.SECONDS)
class Transform {

    void loopa(){
        while (true){
            println('Vai estourar...')

        }
    }

}

new Transform().loopa()