import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
    kotlin("jvm") version embeddedKotlinVersion
}

dependencies {
    implementation(enforcedPlatform("org.jetbrains.kotlin:kotlin-bom:1.7.10"))
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
    implementation("org.jetbrains.kotlin:kotlin-serialization")

    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.21.0")
    implementation("org.jlleitschuh.gradle:ktlint-gradle:11.0.0")

    implementation(platform("org.jetbrains.kotlinx:kotlinx-coroutines-bom:1.6.4"))
    implementation(("org.jetbrains.kotlinx:kotlinx-coroutines-core"))
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        this.freeCompilerArgs += listOf(
            "-opt-in=kotlin.time.ExperimentalTime",
        )
    }
}
