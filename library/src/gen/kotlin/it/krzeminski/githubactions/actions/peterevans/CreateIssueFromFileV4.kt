// This file was generated using 'wrapper-generator' module. Don't change it by hand, your changes will
// be overwritten with the next wrapper code regeneration. Instead, consider introducing changes to the
// generator itself.
package it.krzeminski.githubactions.actions.peterevans

import it.krzeminski.githubactions.actions.ActionWithOutputs
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.toList
import kotlin.collections.toTypedArray

/**
 * Action: Create Issue From File
 *
 * An action to create an issue using content from a file
 *
 * [Action on GitHub](https://github.com/peter-evans/create-issue-from-file)
 */
public class CreateIssueFromFileV4(
    /**
     * The GitHub authentication token
     */
    public val token: String? = null,
    /**
     * The target GitHub repository
     */
    public val repository: String? = null,
    /**
     * The issue number of an existing issue to update
     */
    public val issueNumber: Int? = null,
    /**
     * The title of the issue
     */
    public val title: String,
    /**
     * The file path to the issue content
     */
    public val contentFilepath: String? = null,
    /**
     * A comma or newline-separated list of labels
     */
    public val labels: List<String>? = null,
    /**
     * A comma or newline-separated list of assignees (GitHub usernames)
     */
    public val assignees: List<String>? = null,
    /**
     * Type-unsafe map where you can put any inputs that are not yet supported by the wrapper
     */
    public val _customInputs: Map<String, String> = mapOf(),
    /**
     * Allows overriding action's version, for example to use a specific minor version, or a newer
     * version that the wrapper doesn't yet know about
     */
    _customVersion: String? = null,
) : ActionWithOutputs<CreateIssueFromFileV4.Outputs>("peter-evans", "create-issue-from-file",
        _customVersion ?: "v4") {
    @Suppress("SpreadOperator")
    public override fun toYamlArguments() = linkedMapOf(
        *listOfNotNull(
            token?.let { "token" to it },
            repository?.let { "repository" to it },
            issueNumber?.let { "issue-number" to it.toString() },
            "title" to title,
            contentFilepath?.let { "content-filepath" to it },
            labels?.let { "labels" to it.joinToString(",") },
            assignees?.let { "assignees" to it.joinToString(",") },
            *_customInputs.toList().toTypedArray(),
        ).toTypedArray()
    )

    public override fun buildOutputObject(stepId: String) = Outputs(stepId)

    public class Outputs(
        private val stepId: String,
    ) {
        /**
         * The number of the created issue
         */
        public val issueNumber: String = "steps.$stepId.outputs.issue-number"

        public operator fun `get`(outputName: String) = "steps.$stepId.outputs.$outputName"
    }
}
